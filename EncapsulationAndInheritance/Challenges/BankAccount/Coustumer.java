package EncapsulationAndInheritance.Challenges.BankAccount;

public class Coustumer {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("001", "Navneet");
        account.depositMoney(100);
        System.out.println(account.withdrawMoney(200)); 
        account.depositMoney(-50);
        account.withdrawMoney(-50);
    }

}
