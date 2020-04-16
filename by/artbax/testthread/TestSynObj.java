package by.artbax.testthread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestSynObj {

	public static void main(String[] args) {
		new Worker().main();

	}

}

class Worker {
	Random rand = new Random();

	Object lock1 = new Object();
	Object locj2 = new Object();

	private List<Integer> list1 = new ArrayList<>();
	private List<Integer> list2 = new ArrayList<>();

	public void addToList1() {
		synchronized (lock1) {

			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			list1.add(rand.nextInt(100));
		}
	}

	public void addToList2() {
		synchronized (locj2) {

			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			list2.add(rand.nextInt(100));
		}
	}

	public void work() {
		for (int i = 0; i < 1000; i++) {
			addToList2();
			addToList1();
		}
	}

	public void main() {
		long before = System.currentTimeMillis();

		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				work();
			}
		});

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				work();
			}
		});

		thread1.start();
		thread2.start();

		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}

		long after = System.currentTimeMillis();

		System.out.println("Program took " + (after - before) + "ms to run");
		System.out.println(list1.size() + " L1");
		System.out.println(list2.size() + " L2");

	}
}