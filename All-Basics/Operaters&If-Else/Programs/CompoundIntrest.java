import java.util.Scanner;

public class CompoundIntrest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Compound Intrest 
        System.out.println("Welcome in the Compound Intrest ");
        System.out.print("Enter Your Principal Amount : ");
        int p = input.nextInt();

        System.out.print("Enter Your Rate of Intrest : ");
        int r = input.nextInt();

        System.out.print("Enter Your Time : ");
        int t = input.nextInt();

        int CompoundIntrest = p*(1+r/100)*t; 

        System.out.println("Your Compound Intrest is : " + CompoundIntrest);
    }

}
