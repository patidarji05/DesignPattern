package com.creational.Abstract;

public class AndroidDevFactory extends EmployeeAbstract {

	public Employee createEmployee() {
		return new Android();
	}

}
