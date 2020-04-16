package by.artbax.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("test.txt");
		PrintWriter write = new PrintWriter(file);
		write.println("Test write file");
		write.close();
	}
	
}
