package by.belarus.yanushkevich.testtask.controller;

import java.util.Scanner;

import by.belarus.yanushkevich.testtask.model.data.Person;
import by.belarus.yanushkevich.testtask.model.logic.ScenarioWorker;
import by.belarus.yanushkevich.testtask.model.logic.WorkWithPerson;
import by.belarus.yanushkevich.testtask.model.logic.WorkWithTelephoneList;

public class PersonAddScenario {
	Scanner scanner = new Scanner(System.in);
	Person person = new Person();

	public static void mainScenario() {
		
	}

	public void creatingPersonScenario(Person person) {
		ScenarioWorker.setPersonName(person);
		ScenarioWorker.setPersonEmail(person);
		ScenarioWorker.setPersonEmail(person);
		workWithTelephoneList(person);
		workWithRoleListScenario(person);
	}
	
	public void personChangeScenario(Person person) {
		boolean exit = false;
		do {
			System.out.println("Enter action number:\n1)Set person name\n2)Set person surname"
					+ "\n3)Set person email\n4)Work with telephone number list"
					+ "\n5)Work with role list\n6)Show information about person"
					+ "\n7)Exit");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				ScenarioWorker.setPersonName(person);
				break;
			case 2:
				ScenarioWorker.setPersonSurname(person);
				break;
			case 3:
				ScenarioWorker.setPersonEmail(person);
				break;
			case 4:
				workWithTelephoneList(person);
				break;
			case 5:
				workWithRoleListScenario(person);
				break;
			case 6:
				System.out.println(person.toString());
				break;
			case 7:
				exit = true;
				break;
			default:
				System.out.println("There is no action with this number");
				break;
			}
		} while (!exit);
	}

	public void workWithTelephoneList(Person person) {
		 boolean exit = false;
		do {
			System.out.println("Entering action number:\n1)Add new telephone number"
					+ "\n2)Change exist telephone number\n3)Show telephone numbers"
					+ "\n4)Show entered role count\n5)Exit");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				ScenarioWorker.addTelephoneNumber(person);
				break;
			case 2:
				ScenarioWorker.changeTelephoneNumber(person);
				break;
			case 3:
				ScenarioWorker.showTelephoneNumberList(person);
				break;
			case 4:
				ScenarioWorker.showSomeTelephoneNumber(person);
				break;
			case 5:
				exit = true;
				break;
			default:
				System.out.println("Enter number of exist action");
				break;
			}
		} while (!exit);

	}

	public void workWithRoleListScenario(Person person) {
		boolean exit = false;
		do {
			System.out.println("Enter action number:\n1)Add new role"
					+ "\n2)Change exist role\n3)Show all telephone numbers"
					+ "\n4)Show entered telephone number count\n5)Exit");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				ScenarioWorker.addRole(person);
				break;
			case 2:
				ScenarioWorker.changeRole(person);
				break;
			case 3:
				ScenarioWorker.showRoleList(person);
				break;
			case 4:
				ScenarioWorker.showSomeRole(person);
				break;
			case 5:
				exit = true;
				break;
			default:
				System.out.println("Enter number of exist action");
				break;
			}
		} while (!exit);

	}
}
