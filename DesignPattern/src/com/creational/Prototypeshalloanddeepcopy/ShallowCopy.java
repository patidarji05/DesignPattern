package com.creational.Prototypeshalloanddeepcopy;

import com.creational.Prototype.NetworkConnection;

public class ShallowCopy {
	public static void main(String[] args) throws InterruptedException {

		System.out.println("Prototype shallow copy  design pattern");

		NetworkConnection n1 = new NetworkConnection();
		n1.setIp("192.87.6.8");
		n1.loadImpData();
		System.out.println(n1);

		// we are creating new object using clone method

		try {
			NetworkConnection n2 = (NetworkConnection) n1.clone();
			n2.getDomains().add("www.addnewDomain.com");
		
			System.out.println("n2 object");
			System.out.println(n2);
			
			System.out.println("n1 object");
			System.out.println(n1);
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
