package by.belarus.yanushkevich.testtask.model.logic;

import by.belarus.yanushkevich.testtask.model.data.Person;

public class WorkWithPerson {

	public static void setPersonName(Person person, String name) {
		person.setName(name);
	}

	public static void setSurname(Person person, String surname) {
		person.setSurname(surname);
	}

	public static void setEmail(Person person, String email) {
		if (WorkWithEmail.isValidate(email)) {
			person.setEmail(email);
		}
	}

	public static boolean addTelephoneNumber(Person person, String number) {
		boolean answer = false;
		if (WorkWithTelephoneList.isValidate(number)
				&& WorkWithTelephoneList.isFillTelephoneList(person.getTelephoneList()) == false) {
			WorkWithTelephoneList.addNumber(person.getTelephoneList(), number);
			answer = true;
		}
		return answer;
	}

	public static boolean changeTelephoneNumber(Person person, String number, int telephoneNumberIndex) {
		boolean answer = false;
		if (WorkWithTelephoneList.isValidate(number)) {
			WorkWithTelephoneList.changeNumber(person.getTelephoneList(), number, telephoneNumberIndex);
			answer = true;
		}
		return answer;
	}

	// Method addRole return true if person role was added successfully
	// or return false if person roleList was full
	public static boolean addRole(Person person, String role) {
		boolean answer = true;
		if (!WorkWithRole.isFillRoleList(person.getRoleList())) {
			WorkWithRole.addRole(person.getRoleList(), role);
		} else {
			answer = false;
		}
		return answer;
	}

	// Method changeRole return true if person role was changed successfully
	// or false if was entering wrong index
	public static boolean changeRole(Person person, String role, int roleIndex) {
		boolean answer = false;
		if (WorkWithRole.getRoleCount(person.getRoleList()) <= person.getRoleList().getROLE_COUNT()
				&& WorkWithRole.getRoleCount(person.getRoleList()) > 0) {
			WorkWithRole.changeRole(person.getRoleList(), role, roleIndex);
			answer = true;
		}
		return answer;
	}


}
