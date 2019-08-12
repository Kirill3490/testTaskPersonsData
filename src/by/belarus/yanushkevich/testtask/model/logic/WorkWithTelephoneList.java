package by.belarus.yanushkevich.testtask.model.logic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.belarus.yanushkevich.testtask.model.data.TelephoneList;

public class WorkWithTelephoneList {
	public static void addNumber(TelephoneList telephoneNumberList, String telephoneNumber) {
		telephoneNumberList.getTelephoneList().add(telephoneNumber);
	}

	// Method isValidate making a check. The entered string is a phone number
	public static boolean isValidate(String telephoneNumber) {
		boolean answer = false;
		Pattern pattern = Pattern.compile("375\\d{2}\\s{1}\\d{7}");
		Matcher matcher = pattern.matcher(telephoneNumber);
		if (matcher.matches()) {
			answer = true;
		}
		return answer;
	}

	public static boolean isFillTelephoneList(TelephoneList telephoneNumberList) {
		boolean answer = true;
		if (telephoneNumberList.getTelephoneList().size() <= telephoneNumberList.getTELEPHONE_COUNT()) {
			answer = false;
		}
		return answer;
	}
	
	public static int getTelephoneListCount(TelephoneList telephoneNumberList) {
		return telephoneNumberList.getTelephoneList().size();
	}

	public static void showTelephoneNumberList(TelephoneList telephoneNumberList) {
		System.out.println(telephoneNumberList.toString());
	}

	public static void changeNumber(TelephoneList telephoneNumberList, String telephoneNumber, int telephoneIndex) {
		telephoneNumberList.getTelephoneList().set(telephoneIndex, telephoneNumber);
	}
	public static void deleteTelephoneNumber(TelephoneList telephoneList, int telephoneIndex) {
		telephoneList.getTelephoneList().remove(telephoneIndex);
	}
}
