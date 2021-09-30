package Threads;

class A extends Thread {
	int count;

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			increament();
		}
	}

	public void increament() {
		count++;
	}
}

public class JoinThread {

	public static void main(String[] args) throws Exception {
		A obj = new A();
		obj.start();
		obj.join();
		System.out.println(obj.count);
	}
}
