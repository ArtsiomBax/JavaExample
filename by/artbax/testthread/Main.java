package by.artbax.testthread;

public class Main {

	public static void main(String[] args) {
//		MyThread myThread = new MyThread();
//		myThread.start();
//		MyThread myThread1 = new MyThread();
//		myThread1.start();
		Thread myThread = new Thread(new Runner());
		System.out.println("Main thread");
	}

}
class Runner implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Hello, new thread with Interfejs" + i);
	}

}

class MyThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Hello, new thread" + i);
		}
	}
}
}