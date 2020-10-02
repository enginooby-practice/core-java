package multithreading;

public class ThreadInitDriver {
  public static void main(String[] args) {
    for (int i = 0; i < 3; i++) {
      new ThreadClassDemo().start();
    }
    for (int i = 0; i < 3; i++) {
      Thread thread = new Thread(new ThreadInterfaceDemo());
      thread.start();
    }
  }
}
