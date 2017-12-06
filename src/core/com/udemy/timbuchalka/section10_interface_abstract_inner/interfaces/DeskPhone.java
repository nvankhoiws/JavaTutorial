package core.com.udemy.timbuchalka.section10_interface_abstract_inner.interfaces;

public class DeskPhone implements ITelephone {
    private int phoneNumber;

    private boolean isRinging  = false;

    public DeskPhone(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("This deskphone does not have power button");
    }

    @Override
    public void dial(int phoneNumber) {
        if (isRinging)
            System.out.println("Incoming call from " + phoneNumber);
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering the phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == this.phoneNumber) {
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
