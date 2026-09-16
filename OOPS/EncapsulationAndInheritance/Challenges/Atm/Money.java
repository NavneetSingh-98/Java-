package OOPS.EncapsulationAndInheritance.Challenges.Atm;

public class Money {

    private String accountNumber;
    private String accountHolderName;
    private double balance;
    // private String checkBalance;

    public Money(String accountNumber, String accountHolderName, double balance, String checkBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        // this.checkBalance = checkBalance;
    }

    //Money Deposit
    public void depositeCurrency(double money){
        if(money <= 0){
            System.out.println("Invalid Deposit");
        }else{
            balance += money;
        }
    }

    //withdraw money
    public double withdarwCurrency(double money){
        if(balance >= money){
            balance -= money;
        }else if(money <= 0){
            System.out.println("you have run out of money ");
        }else{
            money = balance;
            money = 0;
        }
        return money;
    }

    



}
