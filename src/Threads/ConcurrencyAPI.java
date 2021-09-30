package Threads;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConcurrencyAPI extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("Hello");
		increment();

	}

	private void increment() {
		AtomicInteger i = new AtomicInteger();
		i.incrementAndGet();
	}

	public static void main(String[] args) {
		ConcurrencyAPI c = new ConcurrencyAPI();
		c.start();

	}
}
