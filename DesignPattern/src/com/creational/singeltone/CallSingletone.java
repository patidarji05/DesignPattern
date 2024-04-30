package com.creational.singeltone;

public class CallSingletone extends Thread{
	public static void main(String[] args) {
		
		Singletone s1 = Singletone.getInstance("pradeep");
		System.out.println("Singeltone Object1: " +  s1.hashCode());
		
		Singletone s2 = Singletone.getInstance("Ram");
		System.out.println("Singeltone Object2: " +  s2.hashCode());
		
		
		
		// using muthithreading 
		
		Thread t1 = new Thread(new MyRunnable("pradeep"));
		
		Thread t2 = new Thread(new MyRunnable("ram"));
		t1.start();
		t2.start();
		
		
	}

}
