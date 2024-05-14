package com.creational.Prototype;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Prototype design pattern");

		NetworkConnection n1 = new NetworkConnection();
		n1.setIp("192.87.6.8");
		n1.loadImpData();
		System.out.println(n1);

		// we are creating new object using clone method

		try {
			NetworkConnection n2 = (NetworkConnection) n1.clone();
			System.out.println(n2);
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}

/**
 * 
 * 1. The concept is the copy an existing object rather than creating a new
 * instance from scratch, because creating new object may be costly.
 * 
 * 2. this approach save costly resource and time, especially when object
 * creation is heavy process.
 * 
 * 
 */
