package com.structural.adapter;

public class AdopterCharger implements AppleCharge {

	private AndroidCharger charger;

	public AdopterCharger(AndroidCharger charger) {
		this.charger = charger;

	}

	@Override
	public void chargePhone() {
		charger.chargePhone();
	}

}
