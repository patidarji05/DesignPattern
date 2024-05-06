package com.creational.builder;

public class User {

	private final int userId;
	private final String userName;
	private final String userEmai;

	private User(UserBuilder builder) {
		this.userId = builder.userId;
		this.userName = builder.userName;
		this.userEmai = builder.userEmai;

	}

	public int getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public String getUserEmai() {
		return userEmai;
	}

	
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userEmai=" + userEmai + "]";
	}



	static class UserBuilder {
		private int userId;
		private String userName;
		private String userEmai;

		public UserBuilder() {

		}

		public UserBuilder setUserId(int userId) {
			this.userId = userId;
			return this;
		}

		public UserBuilder setUserName(String userName) {
			this.userName = userName;
			return this;
		}

		public UserBuilder setUserEmai(String userEmai) {
			this.userEmai = userEmai;
			return this;
		}

		public User bulid() {
			User user = new User(this);
			return user;
		}

	}

}
