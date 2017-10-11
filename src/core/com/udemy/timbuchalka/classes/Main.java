package core.com.udemy.timbuchalka.classes;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 10/11/20172:27 PM.
 */
public class Main {
    public static void main(String[] args) {
        Car vios = new Car();

        vios.setModel("HDL45XK 1.5L");
        System.out.println(vios.getModel());

        vios.setManufacturer("BMW");
        System.out.println(vios.getManufacturer());
    }

}
