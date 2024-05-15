package com.behavioural.itrator;

import java.util.List;

public class MyIntratorImpl implements MyItrator {

	private List<User> list;
	private int length;
	private int position = 0;

	public MyIntratorImpl(List<User> userList) {
		this.list = userList;
		this.length = userList.size();
	}

	@Override
	public boolean hasNext() {
		if (position >= length)
			return false;
		else
			return true;
	}

	@Override
	public Object next() {
		User user = list.get(position);
		position += 1;
		return user;
	}

}
