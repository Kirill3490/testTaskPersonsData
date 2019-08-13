package by.belarus.yanushkevich.testtask.model.data;

import java.util.ArrayList;

public class PersonList {
	private ArrayList<Person> personList;
	
	public PersonList() {
		this.personList = new ArrayList<>();
	}
	
	public ArrayList<Person> getPersonList() {
		return personList;
	}

	public void setPersonList(ArrayList<Person> personList) {
		this.personList = personList;
	}
}
