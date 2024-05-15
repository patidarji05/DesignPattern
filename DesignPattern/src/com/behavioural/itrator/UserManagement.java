package com.behavioural.itrator;

import java.util.ArrayList;

public class UserManagement {

	private ArrayList<User> userlist = new ArrayList<>();

	public void addUser(User user) {
		this.userlist.add(user);
	}

	public User getUser(int index) {
		return this.userlist.get(index);
	}
	
	public MyItrator getItrator() {
		return new MyIntratorImpl(this.userlist);
	}

}
