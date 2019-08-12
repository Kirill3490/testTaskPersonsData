package by.belarus.yanushkevich.testtask.model.logic;

import java.util.Scanner;

import by.belarus.yanushkevich.testtask.model.data.Person;

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
	
	public static void changeTelephoneNumber(Person person) {
		System.out.println("Enter telephone number:");
		String number = scanner.nextLine();
		System.out.println("Enter telephone index:");
		int index = scanner.nextInt();
		if (WorkWithPerson.changeTelephoneNumber(person, number, index)) {
			System.out.println("Number was changed successfully");
		} else {
			System.out.println("Check the entered number or index");
		}
	}
	
	public static void showTelephoneNumber(Person person) {
		WorkWithTelephoneList.showTelephoneNumberList(person.getTelephoneList());
	}
}
