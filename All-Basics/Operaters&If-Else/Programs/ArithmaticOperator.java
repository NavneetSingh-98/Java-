import java.util.Scanner;

public class ArithmaticOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome in the Arithmatic Operator ");

        System.out.print("Enter Your First Number : ");

        int first = input.nextInt();

        System.out.print("Enter Your Second Number : ");
        int second = input.nextInt();

        int add = first + second;
        int subs = first - second;
        int multi = first * second;
        int div = first / second;
        int mod = first % second;
        
        System.out.print("\nYour Addition is : "  + add );
        System.out.print("\nYour substraction  is : " + subs);
        System.out.print("\nYour Multiplecation is : " + multi);
        System.out.print("\nYour division  is : " + div);
        System.out.print("\nYour Modules  is : " + mod);


    }

}
