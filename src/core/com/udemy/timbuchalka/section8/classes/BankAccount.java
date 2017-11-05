package core.com.udemy.timbuchalka.section8.classes;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 10/11/20173:11 PM.
 */
public class BankAccount {
    private String accountNumber;
    private Double balance;
    private String customerName;
    private String email;
    private String phone;

    public BankAccount() {
        this("", 0.0, "", "", "");
    }

    public BankAccount(String accountNumber, Double balance, String customerName, String email, String phone) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phone = phone;
    }

    public String depositFund(Double deposit) {
        if (deposit != null && deposit > 0) {
            this.balance += deposit;
            return "success";
        } else {
            return "fail";
        }
    }

    public String withdrawFund(Double withdraw) {
        if (withdraw != null && withdraw <= balance && withdraw > 0) {
            this.balance -= withdraw;
            return "success";
        } else {
            return "fail";
        }
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
//        bankAccount.setBalance((double) 150000);


//        BankAccount bankAccount = new BankAccount("045 Vietcombank", 100000.0, "Nguyen Van Khoi"
//                , "nvankhoiws@gmail.com", "0974689594");

        String depositResult = bankAccount.depositFund(null);
        System.out.println("depositResult time 1\t" + depositResult);

        depositResult = bankAccount.depositFund(Double.valueOf(-150000));
        System.out.println("depositResult time 2\t" + depositResult
                + " | the current balance is " + String.valueOf(bankAccount.getBalance()));

        depositResult = bankAccount.depositFund(Double.valueOf(150));
        System.out.println("depositResult time 3\t" + depositResult
                + " | the current balance is " + String.valueOf(bankAccount.getBalance()));


        String withdrawResult = bankAccount.withdrawFund(Double.valueOf(-300000));
        System.out.println("withdrawResult time 1\t" + withdrawResult
                + " | the current balance is " + String.valueOf(bankAccount.getBalance()));

        withdrawResult = bankAccount.withdrawFund(null);
        System.out.println("withdrawResult time 2\t" + withdrawResult
                + " | the current balance is " + String.valueOf(bankAccount.getBalance()));


        withdrawResult = bankAccount.withdrawFund(Double.valueOf(150));
        System.out.println("withdrawResult time 3\t" + withdrawResult
                + " | the current balance is " + String.valueOf(bankAccount.getBalance()));

        withdrawResult = bankAccount.withdrawFund(Double.valueOf(150000));
        System.out.println("withdrawResult time 3\t" + withdrawResult
                + " | the current balance is " + String.valueOf(bankAccount.getBalance()));

        withdrawResult = bankAccount.withdrawFund(Double.valueOf(1));
        System.out.println("withdrawResult time 3\t" + withdrawResult
                + " | the current balance is " + String.valueOf(bankAccount.getBalance()));
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
