package by.artbax.main2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) throws FileNotFoundException {
		 File file = new File("test.txt");
		
		Scanner scan = new Scanner(file);
		String input = scan.nextLine();
		String[] numbers = input.split(" ");
		int[] num = new int[5];
		int count = 0;
		for (String number: numbers) {
			num [count++] = Integer.parseInt(number);
		}
		
		System.out.println(Arrays.toString(num));
		
		scan.close();
	}

}

