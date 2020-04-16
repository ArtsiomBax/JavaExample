package by.artbax.main;

public class Main {

	public static void main(String[] args) {
		Person p1 = new Person("Bob", 21);
		Person p2 = new Person("Tom", 25);
		p2.printNumOfPerson();
		p1.printNumOfPerson();
		Person p3 = new Person("Max", 28);
		p3.printNumOfPerson(); 
	}
}

class Person {
	private String name;
	private int age;
	private static int countPerson; 
	
	


public Person (String name, int age) {
	this.name = name;
	this.age = age;
	countPerson++;
}
	

	public void say() {
		System.out.println("Меня зовут: " + name + ", мне: " + age + " лет.");
	}

	public void setName(String name) {
		if (name.isEmpty()){
			System.out.println("Имя не может быть пустое!");
		} else {
		this.name = name;
		}
	}

	public String getName() {
		return name;

	}

	public void setAge(int age) {
		if (age > 0) {
			this.age = age;
		} else {
			System.out.println("Возраст должен быть положительным");
		}
	}

	public int getAge() {
		return age;
	}
	public void printNumOfPerson() {
		System.out.println("Количество персон: " + countPerson);
	}
	
}
