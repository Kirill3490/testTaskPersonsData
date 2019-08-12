package by.belarus.yanushkevich.testtask.model.data;

import java.util.LinkedList;

public class TelephoneList {
	private LinkedList<String> telephoneList;
	final int TELEPHONE_COUNT;
	
	public TelephoneList() {
		this.telephoneList = new LinkedList<>();
		this.telephoneList.add(0, "missing");
		this.telephoneList.add(1, "missing");
		this.telephoneList.add(2, "missing");
		this.TELEPHONE_COUNT = 3;
	}
	
	public TelephoneList(int telephoneNumberCount) {
		this.telephoneList = new LinkedList<>();
		this.TELEPHONE_COUNT = telephoneNumberCount;
		for (int i = 0; i < this.TELEPHONE_COUNT; i++) {
			this.telephoneList.add(i, "missing");
		}
	}
	
	
	public LinkedList<String> getTelephoneList() {
		return telephoneList;
	}
	public void setTelephoneList(LinkedList<String> telephoneList) {
		this.telephoneList = telephoneList;
	}
	
	@Override
	public String toString() {
		String answer = "Telephone number list: /n";
		for (int i = 0; i < this.TELEPHONE_COUNT; i++) {
			answer = "1) " + this.telephoneList.get(i) + ".\n";
			
		}
		return answer ;
	}
	
}
