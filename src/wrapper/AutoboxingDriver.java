package wrapper;

import java.util.ArrayList;

public class AutoboxingDriver {
  public static void main(String[] args) {
    char ch = 'a';
    // Autoboxing- primitive to Character object conversion
    Character a = ch;

    ArrayList<Integer> arrayList = new ArrayList<Integer>();
    // Autoboxing because ArrayList stores only objects
    arrayList.add(25);
    // printing the values from object
    System.out.println(arrayList.get(0));
  }
}
