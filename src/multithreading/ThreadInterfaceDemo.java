package multithreading;

public class ThreadInterfaceDemo implements Runnable {
  @Override
  public void run() {
    System.out.println("Thread (interface) ID " + Thread.currentThread().getId() + " is running");
  }
}
