package OOPS.EncapsulationAndInheritance.Challenges.Atm;

public class Check {
    public static void main(String[] args) {
        Money m1 = new Money("001", "Navneet", 0, null);
        m1.depositeCurrency(500);
       System.out.println(m1.withdarwCurrency(100));
       m1.depositeCurrency(-80);
       System.out.println(m1.withdarwCurrency(600));
      
    }

}
