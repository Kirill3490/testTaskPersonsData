package by.belarus.yanushkevich.testtask.controller;

import by.belarus.yanushkevich.testtask.model.data.Person;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		PersonAddScenario scenario = new PersonAddScenario();
		scenario.personChangeScenario(person);
	}
}
