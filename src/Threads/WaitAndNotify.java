package Threads;

import java.util.ArrayList;
import java.util.List;

public class WaitAndNotify {

	Object full = new Object();
	Object empty = new Object();
	List<Integer> l = new ArrayList<>();

	public synchronized void put(int i) {
		try {
			if (l.size() == 10) {
				empty.wait();
			}
			System.out.println("Put " + l.add(i));
			empty.notifyAll();
		} catch (Exception e) {
			System.out.println("Something wrong");
		}
	}

	public synchronized void get() throws InterruptedException {

		try {
			if (l.size() == 0) {
				full.wait();
			}
			System.out.println("Get   " + l.get(0));
			full.notifyAll();
		} catch (Exception e) {
			System.out.println("Something wrong");
		}
	}

	public static void main(String[] args) throws InterruptedException {
		WaitAndNotify w = new WaitAndNotify();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					for (int i = 0; i < 100; i++) {
						w.put(1);
						Thread.sleep(1000);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		
		Thread t2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					for (int i = 0; i < 100; i++) {
						w.get();
					}
				} catch (Exception e) {
					
				}
				
			}
		});
		
		t1.start();
		t2.start();

	}

}
