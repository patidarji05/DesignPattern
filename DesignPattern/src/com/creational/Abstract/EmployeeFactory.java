package com.creational.Abstract;

public class EmployeeFactory {

	public static Employee getEmployee(EmployeeAbstract factory) {
		return factory.createEmployee() ;

	}

}
