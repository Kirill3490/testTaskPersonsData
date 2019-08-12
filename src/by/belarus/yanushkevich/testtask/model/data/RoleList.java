package by.belarus.yanushkevich.testtask.model.data;

import java.util.LinkedList;

public class RoleList {
	private LinkedList<String> roleList;
	private final int MAX_ROLE_COUNT;
	
	public RoleList() {
		this.roleList = new LinkedList<>();
		this.MAX_ROLE_COUNT = 3;
	}
	
	public RoleList(int roleCount) {
		this.roleList = new LinkedList<>();
		this.MAX_ROLE_COUNT = roleCount;
	}
	
	public int getROLE_COUNT() {
		return MAX_ROLE_COUNT;
	}
	
	public LinkedList<String> getRoleList() {
		return roleList;
	}
	public void setRoleList(LinkedList<String> roleList) {
		this.roleList = roleList;
	}
	
	@Override
	public String toString() {
		String answer = "Role list: \n";
		for (int i = 0; i < this.roleList.size(); i++) {
			answer = (i+1) + ") " + this.roleList.get(i) + ".\n";
			
		}
		return answer ;
	}
}
