package by.belarus.yanushkevich.testtask.model.data;

import java.util.LinkedList;

public class Role {
	private LinkedList<String> roleList;
	final int ROLE_COUNT;
	
	public Role() {
		this.roleList = new LinkedList<>();
		this.roleList.add(0, "missing");
		this.roleList.add(1, "missing");
		this.roleList.add(2, "missing");
		this.ROLE_COUNT = 3;
	}
	
	public Role(int roleCount) {
		this.roleList = new LinkedList<>();
		this.ROLE_COUNT = roleCount;
		for (int i = 0; i < this.ROLE_COUNT; i++) {
			this.roleList.add(i, "missing");
		}
	}
	
	
	public LinkedList<String> getRoleList() {
		return roleList;
	}
	public void setRoleList(LinkedList<String> telephoneList) {
		this.roleList = telephoneList;
	}
	
	@Override
	public String toString() {
		String answer = "Role list: /n";
		for (int i = 0; i < this.ROLE_COUNT; i++) {
			answer = "1) " + this.roleList.get(i) + ".\n";
			
		}
		return answer ;
	}
}
