package structural.adapter.phone.impl;

import structural.adapter.phoneiface.LightningPhone;

public class Iphone implements LightningPhone {
	private boolean connector;

	@Override
	public void recharge() {

		if(connector) {
			System.out.println("Recharge started");
			System.out.println("Recharge finished");
		}
		else {
			System.out.println("Connect Lightning ");
		}
	}

	@Override
	public void useLightning() {

		connector=true;
		System.out.println("Lightning connected");
	}

}
