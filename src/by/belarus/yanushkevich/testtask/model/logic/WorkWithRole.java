package by.belarus.yanushkevich.testtask.model.logic;

import by.belarus.yanushkevich.testtask.model.data.RoleList;


public class WorkWithRole {
	
	public static void addRole(RoleList roleList, String role) {
		roleList.getRoleList().add(role);
	}
	
	//Method isFillRoleList return true if roleList have empty role
	//or false if role list full
	public static boolean isFillRoleList(RoleList roleList) {
		boolean answer = true;
		if (getRoleCount(roleList) < roleList.getROLE_COUNT()) {
			answer = false;
		}
		return answer;
	}
	
	public static int getRoleCount(RoleList roleList) {
		return roleList.getRoleList().size();
	}

	public static void showRoleList(RoleList roleList) {
		System.out.println(roleList.toString());
	}
	
	//Method showSomeRole print on console entered count of roles
	public static String showSomeRole(RoleList roleList, int roleCount) {
		String answer = "Role list:\n";
		for (int i = 0; i < roleCount; i++) {
			answer += (i+1) + ")" + roleList.getRoleList().get(i) + "\n";
		}
		
		return answer;
	}

	public static void changeRole(RoleList roleList, String role, int roleIndex) {
		roleList.getRoleList().set(roleIndex, role);
	}
	
	public static void deleteRole(RoleList roleList, int roleIndex) {
		roleList.getRoleList().remove(roleIndex);
	}
}
