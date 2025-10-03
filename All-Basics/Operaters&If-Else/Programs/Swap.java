import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // System.out.println("Welcome to Swapping station \n");

        // System.out.print("Enter Your Value of A : ");
        // int a = input.nextInt();

        // System.out.print("Enter Your Value of B  : ");
        // int b = input.nextInt();

        // int c = a;
        // a =b;
        // b = c;
        // System.out.print("\nValue of A : "+ a);
        // System.out.print("\nValue of B is " + b);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Number A : ");
        int a = input.nextInt();
        System.out.println("Enter Your Value B : ");
        int b = input.nextInt();

        int c = a;
        a = b;
        b = c;
        System.out.println("\n Value of A : "+a);
        System.out.println("\nValue of B : "+ b);


    }

}
