package structural.adapter.phone.wrap;

import structural.adapter.phoneiface.LightningPhone;
import structural.adapter.phoneiface.MicroUsbPhone;

public class LightningToMicroUsbAdapter implements MicroUsbPhone {
	
    private final LightningPhone lightningPhone;

    public LightningToMicroUsbAdapter(LightningPhone lightningPhone) {
        this.lightningPhone = lightningPhone;
    }

    @Override
    public void useMicroUsb() {
        System.out.println("MicroUsb connected");
        lightningPhone.useLightning();
    }

    @Override
    public void recharge() {
        lightningPhone.recharge();
    }
}
