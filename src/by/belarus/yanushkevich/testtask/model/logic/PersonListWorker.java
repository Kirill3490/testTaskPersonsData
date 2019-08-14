package by.belarus.yanushkevich.testtask.model.logic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

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
			answer.append((i + 1) + ")" + personList.getPersonList().get(i).getName() + " person ID:" + i +"\n");
		}
		System.out.println(answer);
	}

	public static void savePersonListInFile(PersonList personList) {
		String saveFileName = "PersonList.save";
		try (ObjectOutputStream saveFile = new ObjectOutputStream(new FileOutputStream(saveFileName))) {
			saveFile.writeObject(personList.getPersonList());
			System.out.println("File has been saved");
		} catch (Exception ex) {
			System.out.println("File save failed\n" + ex.getMessage());
		}
	}
	
	
	
	@SuppressWarnings("unchecked")
	public static ArrayList<Person> loadPersonListFromFile() {
		ArrayList<Person> personList = new ArrayList<>();
		String loadFileName = "PersonList.save";
		try (ObjectInputStream loadFile = new ObjectInputStream(new FileInputStream(loadFileName))){
			personList=((ArrayList<Person>)loadFile.readObject());
			System.out.println("File has been load");
		} catch (Exception ex) {
			System.out.println("File load failed\n" + ex.getMessage());
		}
		return personList;
	}

	
}
