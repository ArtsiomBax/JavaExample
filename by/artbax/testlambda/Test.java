package by.artbax.testlambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Mother");
		list.add("Home");
		list.add("Box");

		list.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {

				if (o1.length() > o2.length()) {
					return 1;
				} else if (o1.length() < o2.length()) {
					return -1;
				} else {
					return 0;
				}
			}
		});
		
		System.out.println(list);
		
		list.sort((o1, o2) -> {
			if (o1.length() > o2.length()) return 1;
			else if (o1.length() < o2.length()) return -1;
			else return 0;
			});
		System.out.println(list);
	}

}
