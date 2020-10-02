package multithreading;

public class ThreadClassDemo extends Thread {
  @Override
  public void run() {
    System.out.println("Thread (class) ID " + this.getId() + " is running");
  }
}
