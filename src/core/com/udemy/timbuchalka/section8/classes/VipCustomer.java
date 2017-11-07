package core.com.udemy.timbuchalka.section8.classes;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 10/11/20174:58 PM.
 */
public class
VipCustomer {
    private String name;
    private Double creditLimit;
    private String email;

    public VipCustomer(){
        this("Default name",0.0, "@gmail.com");
    }

    public VipCustomer (String name, Double creditLimit) {
        this(name, creditLimit, "@gmail.com");
    }

    public VipCustomer(String name, Double creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public Double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public static void main(String[] args) {
        VipCustomer vipCustomer = new VipCustomer();
        System.out.println("name " + vipCustomer.getName() + " |creditLimit " + vipCustomer.getCreditLimit()
                + " |email " + vipCustomer.getEmail());

        vipCustomer = new VipCustomer("Nguyen Van Khoi", 1000000.0);
        System.out.println("name " + vipCustomer.getName() + " |creditLimit " + vipCustomer.getCreditLimit()
                + " |email " + vipCustomer.getEmail());

        vipCustomer = new VipCustomer("Nguyen Van Khoi", 2000000.0, "nvankhoiws@gmail.com");
        System.out.println("name " + vipCustomer.getName() + " |creditLimit " + vipCustomer.getCreditLimit()
                + " |email " + vipCustomer.getEmail());

    }
}
