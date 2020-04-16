package by.artbax.main1;

public class Main2 {

	public static void main(String[] args) {
		Person person = new Person("Klod", 24);
		System.out.println(person);
		
	}
}
	class Person {
		private String name;
		private int age;
		
		public Person(String name, int age) {
			this.name = name;
			this.age = age;
		}
		
		@Override
		public String toString() {
			return "Имя: " + name + "," + " возраст " + age;
			
		}
	}

		
