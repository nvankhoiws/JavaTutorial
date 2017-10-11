package core.com.udemy.timbuchalka.classes;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 10/11/20173:11 PM.
 */
public class BankAccount {
    private String accountNumber;
    private Integer balance;
    private String customerName;
    private String email;
    private String phone;

    public String depositFund(Integer deposit) {
        if (deposit != null) {
            this.balance += deposit;
            return "success";
        } else {
            return "fail";
        }
    }

    public String withdrawFund(Integer withdraw) {
        if (withdraw != null && withdraw <= balance) {
            this.balance -= withdraw;
            return "success";
        } else {
            return "fail";
        }
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(150000);
        String depositResult = bankAccount.depositFund(null);
        System.out.println("depositResult\t" + depositResult);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
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
