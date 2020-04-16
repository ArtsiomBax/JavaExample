package by.artbax.projava;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ClassArraytList {
	public static void main(String[] args) {

		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for (int i =0; i <100; i++) {
		arrayList.add(i);
		}
		System.out.println(arrayList);
		System.out.println(arrayList.get(55));
		System.out.println(arrayList.size());
		
		for( int i =0; i<arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		for(Integer z: arrayList) {
			System.out.print(z);
		}
		
		List<Integer>linkedList = new LinkedList<Integer>(); 
	}
}


