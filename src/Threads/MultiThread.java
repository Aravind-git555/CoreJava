package Threads;

class Thread1 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("T1\n");
			try {
				Thread.sleep(1); //1000 millisecond is one second
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Thread2 extends Thread {
	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {
			System.out.println("T2\n");
		}
	}
}

public class MultiThread {

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.start();
		t2.start();
	}

}
