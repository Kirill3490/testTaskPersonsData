package by.belarus.yanushkevich.testtask.model.logic;

import java.util.Scanner;

import by.belarus.yanushkevich.testtask.model.data.Person;
import by.belarus.yanushkevich.testtask.model.data.PersonList;

public class ScenarioWorker {
	static Scanner scanner = new Scanner(System.in);

	public static boolean goOn() {
		boolean answer = false;
		int choice = 0;
		while (choice != 1 || choice != 2) {
			System.out.println("Continue:\n1)Yes\n2)No");
			choice = scanner.nextInt();
			if (choice == 1) {
				answer = true;
				break;
			} else if (choice == 2) {
				break;
			} else {
				System.out.println("Choose exist action");
			}
		}
		return answer;
	}

	// Method addTelephoneNumber add new Telephone to the selected person's
	// telephone list
	public static void addTelephoneNumber(Person person) {
		System.out.println("Enter telephone number");
		String number = scanner.nextLine();
		if (WorkWithTelephoneList.isFillTelephoneList(person.getTelephoneList())) {
			System.out.println("Can't add more numbers. The telephone list is full.");
		} else if (WorkWithPerson.addTelephoneNumber(person, number)) {
			System.out.println("Number was added successfully");
		} else {
			System.out.println("Check the entered number");
		}
	}

	// Method changeTelephoneNumber change exist telephone number that contains in
	// selected person's telephone list
	public static void changeTelephoneNumber(Person person) {
		System.out.println("Enter telephone number:");
		String number = scanner.nextLine();
		System.out.println("Enter telephone index:");
		int index = scanner.nextInt();
		if (index >= 0 && index < person.getTelephoneList().getTelephoneList().size()
				&& WorkWithPerson.changeTelephoneNumber(person, number, index)) {
			System.out.println("Number was changed successfully");
		} else {
			System.out.println("Check the entered number or index");
		}
	}

	// Method showTelephoneNumber print in console all telephone number list that
	// chosen person have
	public static void showTelephoneNumberList(Person person) {
		WorkWithTelephoneList.showTelephoneNumberList(person.getTelephoneList());
	}

	// Method showSomeTelephoneNumber print on console entered count of telephone
	// Number that chosen person have
	public static void showSomeTelephoneNumber(Person person) {
		do {
			System.out.println("Enter the telephone number count, that you want to see");
			int telephoneNumberCount = scanner.nextInt();
			if (telephoneNumberCount > WorkWithTelephoneList.getTelephoneListCount(person.getTelephoneList())) {
				System.out.println("You enter wrong telephone number count");
			} else {
				System.out.println(
						WorkWithTelephoneList.showSomeTelephone(person.getTelephoneList(), telephoneNumberCount));
			}
		} while (goOn());
	}

	// Method addRole add new Role to the selected person's role list
	public static void addRole(Person person) {
		System.out.println("Enter role");
		String role = scanner.nextLine();
		if (WorkWithPerson.addRole(person, role)) {
			System.out.println("Role was added successfully");
		} else {
			System.out.println("Can't add more roles. The role list is full.");
		}
	}

	// Method changeRole change exist role that contains in
	// selected person's role list
	public static void changeRole(Person person) {
		System.out.println("Enter role");
		String role = scanner.nextLine();
		System.out.println("Enter role index:");
		int index = scanner.nextInt();
		if (index >= 0 && index < person.getRoleList().getRoleList().size()
				&& WorkWithPerson.changeRole(person, role, index)) {
			System.out.println("Role was changed successfully");
		} else {
			System.out.println("Check the entered index");
		}
	}

	// Method showRoleList print in console all role list that chosen person have
	public static void showRoleList(Person person) {
		WorkWithRole.showRoleList(person.getRoleList());
	}

	// Method showSomeRole print on console entered count of roles that chosen
	// person have
	public static void showSomeRole(Person person) {
		do {
			System.out.println("Enter the role count, that you want to see");
				int roleCount = scanner.nextInt();
				if (roleCount > WorkWithRole.getRoleCount(person.getRoleList())) {
					System.out.println("You enter wrong role count");
				} else {
					System.out.println(WorkWithRole.showSomeRole(person.getRoleList(), roleCount));
				}
		} while (goOn());
	}

	// Method setPersonName set name to chosen person
	public static void setPersonName(Person person) {
		System.out.println("Enter person name:");
		String name = scanner.nextLine();
		WorkWithPerson.setPersonName(person, name);
	}

	// Method setPersonSurname set surname to chosen person
	public static void setPersonSurname(Person person) {
		System.out.println("Entering person surname:");
		String surname = scanner.nextLine();
		WorkWithPerson.setSurname(person, surname);
	}

	// Method setPersonEmail set email to chosen person
	public static void setPersonEmail(Person person) {
		System.out.println("Entering person email:");
		String email = scanner.nextLine();
		WorkWithPerson.setEmail(person, email);
	}

	// Method showPersonInformation print on console full Information about chosen
	// person
	public static void showPersonInformation(PersonList personList) {
		System.out.println("Enter person id:");
			int personID = scanner.nextInt();
			if (personID >= 0 && personID < personList.getPersonList().size()) {
				System.out.println(personList.getPersonList().get(personID).toString());
			} else {
				System.out.println("You enter wrong person ID");
			}
	}

}
