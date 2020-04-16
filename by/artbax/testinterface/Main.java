package by.artbax.testinterface;

public class Main {

	public static void main(String[] args) {
		Info info1 = new Animal(1);
		Info info2 = new Person("Kate");
		info1.showInfo();
		info2.showInfo();
	}

}
