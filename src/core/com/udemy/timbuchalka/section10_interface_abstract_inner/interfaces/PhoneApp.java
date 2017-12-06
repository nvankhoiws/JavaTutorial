package core.com.udemy.timbuchalka.section10_interface_abstract_inner.interfaces;

public class PhoneApp {
    public static void main(String[] args) {
        ITelephone iTelephone = new DeskPhone(123);
        iTelephone.powerOn();
        iTelephone.callPhone(123);
//        iTelephone.callPhone(789);
        iTelephone.dial(456);
        iTelephone.isRinging();
        iTelephone.answer();

        System.out.println();

        iTelephone = new MobiPhone(369);
        iTelephone.powerOn();
        iTelephone.callPhone(369);
        iTelephone.dial(456);
        iTelephone.isRinging();
        iTelephone.answer();
    }
}
