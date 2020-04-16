package by.artbax.testthread;

import java.util.Scanner;

public class MainVolatile {

	public static void main(String[] args) {

		MyThread myThread = new MyThread();
		myThread.start();
		
		Scanner scan = new Scanner(System.in);
		scan.nextLine();
		myThread.shutdown();
	}

}

class MyThread extends Thread {
	private volatile boolean running = true;
	@Override
	public void run() {
		while(running) {
			System.out.println("Hello!");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public void shutdown() {
		this.running = false;
	}
}