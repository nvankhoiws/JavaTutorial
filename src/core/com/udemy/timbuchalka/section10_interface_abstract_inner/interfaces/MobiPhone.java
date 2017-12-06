package core.com.udemy.timbuchalka.section10_interface_abstract_inner.interfaces;

public class MobiPhone implements ITelephone{

    private int phoneNumber;

    private boolean isRinging  = false;

    private boolean isOn = false;

    public MobiPhone(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("This mobile phone is powered up");
        isOn = true;
    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn) {
            if (isRinging)
                System.out.println("Incoming call from " + phoneNumber + " to this mobilephone");
        } else {
            System.out.println("The mobilephone is off");
        }
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering the mobile phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == this.phoneNumber && isOn) {
            isRinging = true;
            System.out.println("Ring ring");
        } else {
            isRinging = false;
        }

        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return this.isRinging;
    }
}
