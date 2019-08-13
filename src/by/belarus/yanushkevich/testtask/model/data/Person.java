package by.belarus.yanushkevich.testtask.model.data;

import java.io.Serializable;

public class Person implements Serializable{
	private String name;
	private String surname;
	private String email;
	RoleList roleList;
	TelephoneList telephoneList;

	public Person() {
		this.name = "";
		this.surname = "";
		this.email = "";
		this.roleList = new RoleList();
		this.telephoneList = new TelephoneList();
	}

	public Person(String name, String surname, String email) {
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.roleList = new RoleList();
		this.telephoneList = new TelephoneList();
	}

	public RoleList getRoleList() {
		return roleList;
	}

	public TelephoneList getTelephoneList() {
		return telephoneList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Name: " + this.name + "\nSurname: " + this.surname + "\nEmail: " + this.email + "\n"
				+ this.roleList.toString() + "\n" + this.telephoneList.toString();
	}

}
