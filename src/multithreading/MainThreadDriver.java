package multithreading;

// Java program to control the Main Thread
public class MainThreadDriver extends Thread {
  public static void main(String[] args) {
    // getting reference to Main thread
    Thread t = Thread.currentThread();

    // getting name of Main thread
    System.out.println("Current thread: " + t.getName());

    // changing the name of Main thread
    t.setName("Main thread pro");
    System.out.println("After name change: " + t.getName());

    // getting priority of Main thread
    System.out.println("Main thread priority: " + t.getPriority());

    // setting priority of Main thread to MAX(10)
    t.setPriority(MAX_PRIORITY);

    System.out.println("Main thread new priority: " + t.getPriority());

    // Main thread creating a child thread
    ChildThread ct = new ChildThread();

    // getting priority of child thread
    // which will be inherited from Main thread
    // as it is created by Main thread
    System.out.println("Child thread priority: " + ct.getPriority());

    // setting priority of Main thread to MIN(1)
    ct.setPriority(MIN_PRIORITY);

    System.out.println("Child thread new priority: " + ct.getPriority());

    // starting child thread
    ct.start();
  }
}

// Child Thread class
class ChildThread extends Thread {
  @Override
  public void run() {
      System.out.println("Child thread");
  }
}

