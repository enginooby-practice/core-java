package problems;

// https://leetcode.com/problems/two-sum/solution/
/*Given an array of integers nums and an integer target,
  return indices of the two numbers such that they add up to target.

  You may assume that each input would have exactly one solution,
  and you may not use the same element twice. (*)

  You can return the answer in any order.*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
  public static void main(String[] args) {
    int[] result = algo3(new int[]{2, 7, 11, 15}, 9);

    System.out.println(Arrays.toString(result));
  }

  // Approach 1: Brute Force O(n^2) - O(1)
  public static int[] algo1(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          return new int[]{i, j};
        }
      }
    }
    throw new IllegalArgumentException("No two sum solution");
  }

  // Approach 2: Two-pass Hash table O(n) - O(n)
  public static int[] algo2(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      map.put(nums[i], i);
    }

    for (int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];
      if (map.containsKey(complement) && map.get(complement) != i) { // (*)
        return new int[]{i, map.get(complement)};
      }
    }

    throw new IllegalArgumentException("No two sum solution");
  }

  // Approach 3: One-pass Hash table O(n) - O(n)
  public static int[] algo3(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];
      if (map.containsKey(complement) && map.get(complement) != i) {
        return new int[]{i, map.get(complement)};
      }
      map.put(nums[i], i);
    }
    throw new IllegalArgumentException("No two sum solution");
  }
}
