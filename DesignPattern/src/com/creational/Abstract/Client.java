package com.creational.Abstract;

public class Client {
	
	public static void main(String[] args) {
		
		Employee emp = EmployeeFactory.getEmployee(new AndroidDevFactory());
		System.out.println(emp.getSalary());
		System.out.println(emp.getName());
		
		Employee emp1 = EmployeeFactory.getEmployee(new JavaDevfactory());
		System.out.println(emp1.getSalary());
		System.out.println(emp1.getName());
	}

}
