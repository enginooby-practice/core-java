package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class InspectDriver {
  public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
    Person mySis = new Person("Hoang");

    /* inspect class info using reflection */
    // get class
    Class mySisClass = mySis.getClass();
    System.out.println("Class name of mySis is " + mySisClass.getName());
    // get constructor
    Constructor constructor = mySisClass.getConstructor(String.class);
    System.out.println("Constructor name of the class is " + constructor.getName());
    // get public methods
    Method[] methods = mySisClass.getMethods();
    for (Method method : methods) {
      System.out.println(method.getName());
    }
    // get method by name and its params type
    Method greetingMethod = mySisClass.getDeclaredMethod("greeting", int.class);
    // invoke method
    String greetingMsg = (String) greetingMethod.invoke(mySis, 25);
    System.out.println(greetingMsg);
  }
}

class Person {
  private String name;

  public Person(String name) {
    this.name = name;
  }

  public String greeting(int age) {
    return "Hello! I am " + this.name + " . I am " + age + " years old.";
  }
}
