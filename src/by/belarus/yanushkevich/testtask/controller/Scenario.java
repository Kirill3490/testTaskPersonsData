package by.belarus.yanushkevich.testtask.controller;

import java.io.NotActiveException;
import java.util.Scanner;

import by.belarus.yanushkevich.testtask.model.data.Person;
import by.belarus.yanushkevich.testtask.model.data.PersonList;
import by.belarus.yanushkevich.testtask.model.logic.PersonListWorker;
import by.belarus.yanushkevich.testtask.model.logic.ScenarioWorker;

public class Scenario {
	Scanner scanner = new Scanner(System.in);
	Person person = new Person();
	PersonList list = new PersonList();

	public void mainScenario() {
		boolean exit = false;
			while (!exit) {
				System.out.println("Welcom to persons worker.");
				System.out.println("Choose action number\n1)Load person list\n2)Save person list"
						+ "\n3)Create new person\n4)Change exist person\n5)Delete person from person list"
						+ "\n6)Show all person in list\n7)Show information about choosen person\n8)Exit");
				int choice = scanner.nextInt();
				switch (choice) {
				case 1:
					this.list.setPersonList(PersonListWorker.loadPersonListFromFile());
					break;
				case 2:
					PersonListWorker.savePersonListInFile(list);
					break;
				case 3:
					person = new Person();
					creatingPersonScenario(person, this.list);
					break;
				case 4:
					System.out.println("Enter person id:");
					int personID = scanner.nextInt();
					if (personID >= 0 && list.getPersonList().size() > 0 && personID < list.getPersonList().size()) {
						this.person = PersonListWorker.getPersonFromPersonList(list, personID);
						personChangeScenario(person);
					} else {
						System.out.println("Check enetered person ID");
					}
					break;
				case 5:
					System.out.println("Enter person id:");
					int personId = scanner.nextInt();
					if (personId >= 0 && list.getPersonList().size() > 0 && personId < list.getPersonList().size()) {
						PersonListWorker.removePersonFromPersonList(list, personId);
					} else {
						System.out.println("Check enetered person ID");
					}
					break;
				case 6:
					PersonListWorker.printPersonList(list);
					break;
				case 7:
					ScenarioWorker.showPersonInformation(list);
					break;
				case 8:
					exit = true;
					break;
				default:
					System.out.println("Choose exist action");
					break;
				}
			}
	}

	public void creatingPersonScenario(Person person, PersonList list) {
		ScenarioWorker.setPersonName(person);
		ScenarioWorker.setPersonSurname(person);
		ScenarioWorker.setPersonEmail(person);
		workWithTelephoneList(person);
		workWithRoleListScenario(person);
		PersonListWorker.addNewPerson(list, person);
	}

	public void personChangeScenario(Person person) {
		boolean exit = false;
		do {
			System.out.println("Enter action number:\n1)Set person name\n2)Set person surname"
					+ "\n3)Set person email\n4)Work with telephone number list"
					+ "\n5)Work with role list\n6)Show information about persons" + "\n7)Exit");
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
			System.out.println(
					"Enter action number:\n1)Add new role" + "\n2)Change exist role\n3)Show all telephone numbers"
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
