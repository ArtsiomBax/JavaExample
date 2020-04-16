package by.artbax.main.ananim;

interface AbleToIt {
	public void eat();
}

public class Main {

	public static void main(String[] args) {
		AbleToIt able = new AbleToIt() {

			@Override
			public void eat() {
				System.out.println("sssss");
			}
		};

		Animal animal = new Animal();
		animal.eat();
		Animal animal2 = new Animal() {
			public void eat() {
				System.out.println("Other animal eat");
			}
		};
		animal2.eat();
		able.eat();
	}

}

class Animal {
	public void eat() {
		System.out.println("Animal is eating");
	}
}
