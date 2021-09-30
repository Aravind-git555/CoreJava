package Threads;

class class2 extends Thread {

	int count;

	public synchronized void increament() {
		count++;
	}
}

public class SynchronizedKey {
	public static void main(String[] args) throws InterruptedException {

		class2 obj = new class2();

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					obj.increament();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					obj.increament();

				}
			}
		});

		t1.start();
		t2.start();
		t1.join();
		t2.join();

		System.out.println(obj.count);
	}
}
