package by.artbax.serializ;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
	public static void main(String[] args) {

		Person person1 = new Person(1, "Mark");
		Person person2 = new Person(2, "Anita");
		Person[] people = {new Person(3, "Mike"), new Person(4, "Ken"), new Person(5, "Alla") };
		Person[] people2 = {new Person(6, "Kuki"), new Person(7,"Buki")};

		try {
			FileOutputStream fos = new FileOutputStream("people.bin");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(person1);
			oos.writeObject(person2);
			
			oos.writeInt(people.length);
			
			for (Person person: people) {
				oos.writeObject(person);
			}
			
			oos.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
