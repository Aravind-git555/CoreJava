package Threads;

public class RunnableInterface {
	public static void main(String[] args) {
		Class1 obj = new Class1();
		Thread t = new Thread(obj);
		t.start();
	}
}

class Class1 implements Runnable {
	@Override
	public void run() {
		System.out.println("Hi");
	}
}
