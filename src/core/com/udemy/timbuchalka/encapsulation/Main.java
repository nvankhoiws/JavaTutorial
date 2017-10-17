package core.com.udemy.timbuchalka.encapsulation;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 10/17/20179:21 AM.
 */
public class Main {
    public static void main(String[] args) {
        Printer printer =  new Printer(50.0, 5500);
        printer.getTonerLevel();
        printer.fillUpToner(40.0);
        printer.getTonerLevel();
        printer.printing(6000);
        System.out.println("\n");
        printer.fillUpToner(40.0);
        printer.getTonerLevel();
        printer.printing(25001);
    }
}
