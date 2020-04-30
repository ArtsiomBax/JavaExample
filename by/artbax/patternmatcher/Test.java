package by.artbax.patternmatcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {

		String text = "English texts for beginners to "
				+ "practice bigbpy@gmail.com reading and "
				+ "comprehension "
				+ "online and for free. Practicing your "
				+ "comprehension of written English will "
				+ "both improve your vocabulary and "
				+ "understanding of grammar and word "
				+ "order. The texts below are designed "
				+ "to help myhome@mail.ru you develop "
				+ "while giving you "
				+ "an instant evaluation of your progress.";
		Pattern mail = Pattern.compile("(\\w+)@\\w+\\.(com|ru)");
		Matcher matcher = mail.matcher(text);
		
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
	}

}
