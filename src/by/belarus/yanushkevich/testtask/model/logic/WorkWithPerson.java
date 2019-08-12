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
				&& !WorkWithTelephoneList.isFillTelephoneList(person.getTelephoneList())) {
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
	
	public static void addRole(Person person, String role) {
		if (!WorkWithRole.isFillRoleList(person.getRoleList())) {
			WorkWithRole.addRole(person.getRoleList(), role);
		}
	}
	
	public static void changeRole(Person person, String role, int roleIndex) {
		WorkWithRole.changeRole(person.getRoleList(), role, roleIndex);
	}
	
	public static void savePerson() {
		
	}
	
	public static void deletePerson() {
		
	}
	
	public static Person createPerson() {
		return new Person();
	}
	
	
}
