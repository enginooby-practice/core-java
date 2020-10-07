package algorithm;

public class MostSignificantBit {
  public static void main(String[] args) {
    algo1(1);
  }

  // O(log(n)) - linear search
  public static int algo1(int num) {
    int msb = -1;
    int index = 0; // index of the current bit
    int bit; // 0 or 1

    while (num > 0) {
      bit = num % 2;
      num /= 2;
      if (bit == 1) { // if current bit = 1; msb = index of current bit
        msb = index;
      }
      index++;
    }
    System.out.println("The index of MSB is: " + msb);
    return msb;
  }
}
