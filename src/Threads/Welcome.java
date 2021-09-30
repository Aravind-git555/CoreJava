package Threads;

class Hello extends Thread {

	public void run() {
		for (int i = 1; i <= 10; i++)
			
			System.out.println("RUN");
	}

}

public class Welcome {

	public static void main(String[] args) {
		Hello wel = new Hello();
		wel.start();
		for (int i = 1; i <= 10; i++)
			System.out.println("MAIN");

	}

}
