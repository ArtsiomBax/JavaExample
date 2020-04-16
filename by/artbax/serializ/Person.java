package by.artbax.serializ;

import java.io.Serializable;

public class Person implements Serializable {

	private int id;
	private String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setNmae(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return "ID: " + id + " Name " + name;

	}
}