package by.artbax.main1;

public class Less25 {

	public static void main(String[] args) {
		
		// UPcasting - восходящее преобразование
		Animal  animal = new Dog();
		
		//DOWNcasting - нисходящее преобразование
		Dog dog = (Dog) new Animal(21);
		
		Animal a = new Animal(20);
		Dog doger = (Dog)a;
		doger.bark();
		
	}

}
