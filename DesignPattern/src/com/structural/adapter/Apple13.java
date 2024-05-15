package com.structural.adapter;

public class Apple13 {

	private AppleCharge appleCharge;

	public Apple13(AppleCharge appleCharge) {
		this.appleCharge = appleCharge;
	}

	public void chargeIphone() {
		appleCharge.chargePhone();
	}

}
