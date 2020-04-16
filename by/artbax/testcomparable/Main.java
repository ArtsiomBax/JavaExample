package by.artbax.testcomparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		List<Person> personList = new ArrayList<>();
		Set<Person> personSet = new TreeSet<>();
		
		addElements(personSet);
		addElements(personList);
		
		Collections.sort(personList);
		
		
		System.out.println(personList);
		System.out.println(personSet);

	}

	private static void addElements(Collection collection) {
		collection.add(new Person(2, "Markus"));
		collection.add(new Person(1, "Nina"));
		collection.add(new Person(4, "Max"));
		collection.add(new Person(3, "Evelina"));

	}

}

class Person implements Comparable<Person> {
	private int id;
	private String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}
	
	

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Person o) {

		if (this.name.length() > o.getName().length()) {
			return 1;
		} else if (this.name.length() < o.getName().length()) {
			return -1;
		} else {
			return 0;
		}
	}

}