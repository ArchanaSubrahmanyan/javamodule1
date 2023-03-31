package structural.adapter.phone.impl;

import structural.adapter.phoneiface.MicroUsbPhone;

public class Android implements MicroUsbPhone {
	
	private boolean connector;

	@Override
	public void recharge() {

		if(connector) {
			System.out.println("Recharge started");
			System.out.println("Recharge finished");
		}
		else {
			System.out.println("Connect MicroUsb ");
		}
	}

	@Override
	public void useMicroUsb() {

		connector=true;
		System.out.println("MicroUsb connected");
	}

}
