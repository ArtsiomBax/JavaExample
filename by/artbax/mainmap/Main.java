package by.artbax.mainmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {

		Map<Integer, String> hashMap = new HashMap<>();
		Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
		Map<Integer, String> treeMap = new TreeMap<>();
		
	testMap(treeMap);
	System.out.println();
	testMap(linkedHashMap);
	System.out.println();
	testMap(hashMap);
	
		
	}
	
	public static  void testMap(Map<Integer, String> map) {
		map.put(39, "Bob");
		map.put(12, "Margo");
		map.put(34, "Tom");
		map.put(2, "Ingrid");
		map.put(7, "Lia");
		
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}

}
