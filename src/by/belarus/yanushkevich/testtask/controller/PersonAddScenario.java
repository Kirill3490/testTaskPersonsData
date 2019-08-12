package by.belarus.yanushkevich.testtask.controller;

import java.util.Scanner;

import by.belarus.yanushkevich.testtask.model.data.Person;
import by.belarus.yanushkevich.testtask.model.logic.ScenarioWorker;
import by.belarus.yanushkevich.testtask.model.logic.WorkWithPerson;
import by.belarus.yanushkevich.testtask.model.logic.WorkWithTelephoneList;

public class PersonAddScenario {
	Scanner scanner = new Scanner(System.in);

	public static void addPerson() {
		Person person = WorkWithPerson.createPerson();
	}

	private void creatingMenuChoice(Person person) {
		System.out.println("Entering action number:");
		while (ScenarioWorker.goOn()) {
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Entering person name:");
				String name = scanner.nextLine();
				WorkWithPerson.setPersonName(person, name);
				break;
			case 2:
				System.out.println("Entering person surname:");
				String surname = scanner.nextLine();
				WorkWithPerson.setSurname(person, surname);
				break;
			case 3:
				System.out.println("Entering person email:");
				String email = scanner.nextLine();
				WorkWithPerson.setEmail(person, email);
				break;
			case 4:
				System.out.println("Work with telephon number list");

				break;
			case 5:
				System.out.println("Entering");
				break;
			default:
				System.out.println("There is no action with this number");
				break;
			}
		}
	}

	public void workWithTelephoneList(Person person) {
		do {
			System.out.println("Entering action number:\n1)Add new telephone number"
					+ "\n2)Change exist telephone number\n3)Show telephone numbers");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				ScenarioWorker.addTelephoneNumber(person);
				break;
			case 2:
				ScenarioWorker.changeTelephoneNumber(person);
				break;
			case 3:
				ScenarioWorker.showTelephoneNumber(person);
				break;
			default:
				System.out.println("Enter number of exist action");
				break;
			}
		} while (ScenarioWorker.goOn());
			
	}
}
