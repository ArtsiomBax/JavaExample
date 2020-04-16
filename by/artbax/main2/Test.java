package by.artbax.main2;

import java.util.ArrayList;
import java.util.List;

import by.artbax.main1.Animal;
import by.artbax.main1.Dog;

public class Test {

	public static void main(String[] args) {
		// Java 5
		List animals = new ArrayList();
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Frog");
		
		String animal = (String) animals.get(1);
		System.out.println(animal);
		
		// Generik
		List<String> animals2 = new ArrayList<String>();
		animals2.add("Dog");
		animals2.add("Cat");
		animal = animals2.get(0);
		
		
		//Java 7
		
	
		List<String> animals3 = new ArrayList<>(); 
		
		List<Animal> listOfAnimal = new ArrayList<>();
		listOfAnimal.add(new Animal(1));
		listOfAnimal.add(new Animal(2));
		listOfAnimal.add(new Animal(3));
		test(listOfAnimal);
		
		List<Dog> listOfDog = new ArrayList<>();
		listOfDog.add(new Dog());
		listOfDog.add(new Dog());
		listOfDog.add(new Dog());
		test(listOfDog);
		
		
		
	}
	
	private static void test(List<? extends Animal> list) {
		for(Animal animal: list) {
			animal.eat();
		}
		
	}
	

}

