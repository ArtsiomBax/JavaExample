package by.artbax.testlambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Special {

	public static void main(String[] args) {

		int[] arr1 = new int[10];
		List<Integer> list1 = new ArrayList<>();

		fillArr(arr1);
		fillList(list1);

		// map method
		arr1 = Arrays.stream(arr1).map(a -> a * 2).toArray();
		list1 = list1.stream().map(a -> a * 2).collect(Collectors.toList());

		System.out.println(Arrays.toString(arr1));
		System.out.println(list1);

		// filter method
		int[] arr2 = new int[10];
		List<Integer> list2 = new ArrayList<Integer>();

		fillArr(arr2);
		fillList(list2);

		arr2 = Arrays.stream(arr2).filter(a -> a % 2 == 0).toArray();
		list2 = list2.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());

		System.out.println(Arrays.toString(arr2));
		System.out.println(list2);

		// for each
		Arrays.stream(arr2).forEach(System.out::println);
		list2.stream().forEach(System.out::println);

		// reduce method
		int[] arr3 = new int[10];
		List<Integer> list3 = new ArrayList<>();

		fillArr(arr3);
		fillList(list3);

		int sumArr3 = Arrays.stream(arr3).reduce((acc, b) -> acc + b).getAsInt();
		int ulist3 = list3.stream().reduce((acc, b) -> acc * b).get();

		System.out.println("sumArr3 =" + sumArr3);
		System.out.println(ulist3);
	}

	private static void fillList(List<Integer> list) {
		for (int i = 0; i < 10; i++) {
			list.add(i + 1);
		}
	}

	public static void fillArr(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;
		}
	}

}
