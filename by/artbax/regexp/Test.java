package by.artbax.regexp;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		
// \\d - одна цифра
//  \\w - одна буква		
// + - 1 или более
// * - 0 или более
// ? - 0 или 1 символов до
// ( | ) - или
// [a-zA-Z] - все буквы
// [^] - не
// . - люболй символ
// {2, 4} - точное количество до (от 2 до 4)		
		
		String a = "-222";
		System.out.println(a.matches("-\\d+"));
		
		String b ="Hello.my.home!";
		String[] words = b.split("\\.");
		System.out.println(Arrays.deepToString(words));
		System.out.println(b.replace('.', ' '));
	}

}
