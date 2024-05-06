package com.creational.builder;

public class main {

	public static void main(String[] args) {

		User user = new User.UserBuilder().setUserEmai("pradeeep01@gmail.com").setUserId(11).setUserName("Pradeep")
				.bulid();
		System.out.println(user.toString());
	}

}
