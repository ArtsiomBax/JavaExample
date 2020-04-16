package by.artbax.mainmap;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class TestSet {

	public static void main(String[] args) {

		Set<String> hashSet = new HashSet<>();
		Set<String> linkedHashSet = new LinkedHashSet<>();
		Set<String> treeSet = new TreeSet<>();
	
		hashSet.add("Mark");
		hashSet.add("Alisa");
		hashSet.add("Magda");
		hashSet.add("Alex");
		
		System.out.println(hashSet.contains("Alisa"));
		
		for(String name: hashSet) {
			System.out.println();
		}
	}
	

}
