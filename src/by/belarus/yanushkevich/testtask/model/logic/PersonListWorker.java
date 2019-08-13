package by.belarus.yanushkevich.testtask.model.logic;

import by.belarus.yanushkevich.testtask.model.data.Person;
import by.belarus.yanushkevich.testtask.model.data.PersonList;

public class PersonListWorker {

	// Method add new person in person list
	public static void addNewPerson(PersonList personList, Person person) {
		personList.getPersonList().add(person);
	}

	// Method return person from personList with chosen id
	public static Person getPersonFromPersonList(PersonList personList, int personID) {
		return personList.getPersonList().get(personID);
	}

	// Method removePersonFromPersonList return true if removing was successful or
	// false if person id doesn't exist
	public static boolean removePersonFromPersonList(PersonList personList, int personID) {
		boolean answer = false;
		if (personID > 0 && personID <= personList.getPersonList().size()) {
			personList.getPersonList().remove(personID);
			answer = true;
		}
		return answer;
	}

	// Method printPersonList print on console 
	public static void printPersonList(PersonList personList) {
		StringBuilder answer = new StringBuilder();
		answer.append("Person list:\n");
		for (int i = 0; i < personList.getPersonList().size(); i++) {
			answer.append((i + 1) + ")" + personList.getPersonList().get(i).getName() + "\n");
		}
		System.out.println(answer);
	}
}
