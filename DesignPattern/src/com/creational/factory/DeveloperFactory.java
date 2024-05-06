package com.creational.factory;

public class DeveloperFactory {

	public static Employee getEmployee(String objType) {

		if (objType.trim().equalsIgnoreCase("Android")) {
			return new AndroidDeveloper();
		} else if (objType.trim().equalsIgnoreCase("Java")) {
			return new JavaDeveloper();
		} else {
			return null;
		}

	}

}
