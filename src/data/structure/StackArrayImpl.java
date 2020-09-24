package data.structure;

import java.util.Arrays;

/* Java program to implement basic stack
operations */
public class StackArrayImpl {
  static final int MAX = 1000;
  int topIndex;
  int array[] = new int[MAX]; // Maximum size of Stack

  boolean isEmpty() {
    return (topIndex < 0);
  }

  StackArrayImpl() {
    topIndex = -1;
  }

  boolean push(int x) {
    if (topIndex >= (MAX - 1)) {
      System.out.println("Stack Overflow");
      return false;
    } else {
      array[++topIndex] = x;
      System.out.println(x + " pushed into stack");
      return true;
    }
  }

  int pop() {
    if (topIndex < 0) {
      System.out.println("Stack Underflow");
      return 0;
    } else {
      int x = array[topIndex--];
      return x;
    }
  }

  int peek() {
    if (topIndex < 0) {
      System.out.println("Stack Underflow");
      return 0;
    } else {
      int x = array[topIndex];
      return x;
    }
  }

  void print(){
    System.out.println(Arrays.toString(this.array));
  }
}

// Driver code
class Main {
  public static void main(String args[]) {
    StackArrayImpl s = new StackArrayImpl();
    s.push(10);
    s.push(20);
    s.push(30);
    s.print();
    System.out.println(s.pop() + " Popped from stack");
  }
}
