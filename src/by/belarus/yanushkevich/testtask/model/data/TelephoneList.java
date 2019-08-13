package by.belarus.yanushkevich.testtask.model.data;

import java.io.Serializable;
import java.util.LinkedList;

public class TelephoneList implements Serializable{
	private LinkedList<String> telephoneList;
	private final int MAX_TELEPHONE_COUNT;

	public TelephoneList() {
		this.telephoneList = new LinkedList<>();
		this.MAX_TELEPHONE_COUNT = 3;
	}

	public TelephoneList(int telephoneNumberCount) {
		this.telephoneList = new LinkedList<>();
		this.MAX_TELEPHONE_COUNT = telephoneNumberCount;
	}

	public LinkedList<String> getTelephoneList() {
		return telephoneList;
	}

	public void setTelephoneList(LinkedList<String> telephoneList) {
		this.telephoneList = telephoneList;
	}

	public int getTELEPHONE_COUNT() {
		return MAX_TELEPHONE_COUNT;
	}

	@Override
	public String toString() {
		String answer = "Telephone number list: \n";
		for (int i = 0; i < this.telephoneList.size(); i++) {
				answer += (i+1) + ") " + this.telephoneList.get(i) + ".\n";
		}
		return answer;
	}

}
