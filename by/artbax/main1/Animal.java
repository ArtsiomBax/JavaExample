package by.artbax.main1;

public class Animal {
	
	String name;
	private int id;
	
	public Animal() {
		
	}
	
	public Animal(int id) {
		this.id = id;
	}
	
	public void eat() {
		System.out.println("I'm eating");
	}
	public void sleep() {
		System.out.println("I'm sleping");
	}
	@Override
	public String toString() {
		return String.valueOf(id);
	}
	
	

}
