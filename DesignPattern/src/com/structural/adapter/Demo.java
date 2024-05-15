package com.structural.adapter;

public class Demo {

	public static void main(String[] args) {

		// using adopter class (adopter design patter)

		AndroidCharger charger = new AndroidChargerImpl();

		AdopterCharger aCharger = new AdopterCharger(charger);
		Apple13 apple = new Apple13(aCharger);
		apple.chargeIphone();

		// without using adopter class

		AppleCharge charher = new AppleChargeImpl();

		Apple13 apple1 = new Apple13(charher);

		apple1.chargeIphone();

	}

}

/**

1.   it is structural design pattern.
2.   convert the interface of a class into the another interface that a client want.
3.   in simple words , to provide a interface according to client requirement , while using the services of a class with different 
     interfaces.
*/