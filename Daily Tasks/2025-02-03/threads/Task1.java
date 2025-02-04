package threads;

public class Task1 extends Thread {
	  @Override
	  public void run() {
	    System.out.println("Hello, World!");
	  }

	  public static void main(String[] args) {
	    Task1 thread = new Task1();
	    thread.start();
	  }
	}
