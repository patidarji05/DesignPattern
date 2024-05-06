package com.creational.factory;

public class Developer {
	public static void main(String[] args) {
		
		Employee emp = DeveloperFactory.getEmployee("Android");
		System.out.println("salary: "+ emp.getSalary());	
	}

}


/**

   1. when there is a superclass and multiple subclasses and we want to create object of subclass
      based on input and requirement.
      
      Advantages:
      
      1. focus on creating object for interface rather than implementation.
      2. loose coupling and more robust code.
      
      
 


 * 
 */
