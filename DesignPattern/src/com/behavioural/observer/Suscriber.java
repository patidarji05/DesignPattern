package com.behavioural.observer;

public class Suscriber implements Observer {

	private String name;

	Suscriber(String name) {
		this.name = name;
	}

	@Override
	public void notified(String title) {
		System.out.println("Hello " + this.name +", "+ title);
	}

}
