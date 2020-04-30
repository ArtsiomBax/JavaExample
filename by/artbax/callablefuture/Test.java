package by.artbax.callablefuture;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {

	public static void main(String[] args) throws ExecutionException {

		ExecutorService executorService = Executors.newFixedThreadPool(1);
		Future<Integer> future = executorService.submit(() -> {
			System.out.println("Starting");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("Finished");
			Random random = new Random();
			return random.nextInt(10);

		});

		executorService.shutdown();
		try {
			int result = future.get();
			System.out.println(result);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
