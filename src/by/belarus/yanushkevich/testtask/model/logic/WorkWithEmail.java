package by.belarus.yanushkevich.testtask.model.logic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.belarus.yanushkevich.testtask.model.data.Person;

public class WorkWithEmail {
	//Method isValidate making a check. The entered string is a email
	public static boolean isValidate(String email) {
		boolean answer = false;
		Pattern pattern = Pattern.compile("\\w+(@)[a-z]+[.][a-z]+");
		Matcher matcher = pattern.matcher(email);
		if (matcher.matches()) {
			answer = true;
		}
		return answer;
	}
	
	public static void addEmail(Person person, String email) {
		
	}
	
	public static void deleteEmail(Person person, String email) {
		
	}
}
