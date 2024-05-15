package com.behavioural.itrator;

public class Main {

	public static void main(String[] args) {

		UserManagement userManagement = new UserManagement();

		userManagement.addUser(new User("Pradeep", "78"));
		userManagement.addUser(new User("Yash", "86"));
		userManagement.addUser(new User("jeet", "8"));
		userManagement.addUser(new User("rahul", "7"));
		userManagement.addUser(new User("saneem", "87"));

		MyItrator itrator = userManagement.getItrator();

		while (itrator.hasNext()) {
			User user = (User) itrator.next();
			System.out.println("User name is :" + user.getName() + " and user id is :" + user.getId());

		}
	}

}
