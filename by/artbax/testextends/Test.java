package by.artbax.testextends;

public class Test {

	public static void main(String[] args) {

		Animal a = new Animal();
		Dog d = new Dog();
		Cat c = new Cat();
		test(a);
		test(c);
		test(d);
	}
	
	public static void test(Animal animal) {
		animal.eat();
	}

}
