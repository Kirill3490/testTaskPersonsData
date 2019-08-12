package by.belarus.yanushkevich.testtask.model.logic;

import by.belarus.yanushkevich.testtask.model.data.RoleList;


public class WorkWithRole {
	
	public static void addRole(RoleList roleList, String role) {
		roleList.getRoleList().add(role);
	}
	
	public static boolean isFillRoleList(RoleList roleList) {
		boolean answer = true;
		if (getRoleCount(roleList) <= roleList.getROLE_COUNT()) {
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

	public static void changeRole(RoleList roleList, String role, int roleIndex) {
		roleList.getRoleList().set(roleIndex, role);
	}
	public static void deleteRole(RoleList roleList, int roleIndex) {
		roleList.getRoleList().remove(roleIndex);
	}
}
