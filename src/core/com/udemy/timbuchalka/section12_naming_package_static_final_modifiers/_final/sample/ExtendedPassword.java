package core.com.udemy.timbuchalka.section12_naming_package_static_final_modifiers._final.sample;

/**
 * Created by dev on 23/11/2015.
 */
public class ExtendedPassword extends Password {
    private int decryptedPassword;

    public ExtendedPassword(int password) {
        super(password);
        this.decryptedPassword = password;
    }

//    @Override
//    public void storePassword() {
//        System.out.println("Saving password as " + this.decryptedPassword);
//    }
}
