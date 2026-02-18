package OOPS.EncapsulationAndInheritance.Challenges.BankAccount;

public class BankAccount {

    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    public void depositMoney(double money){
        if(money <= 0){
            System.out.println("Invalid Deposit");
        }else{
             balance += money;
           
        }
      
    }

    public double withdrawMoney( double money){
        if(balance >= money){
            balance -= money;
        }else if(money <= 0){
            System.out.println("Invalid withdraw");
        }else{
            money = balance ;
            balance = 0;
        }
        
        return money;
      
    }


    

    

}
