import java.util.Scanner;

public class SwapingNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome in the Swapping Two Numbers ");

        System.out.println("Enter Your First Number : ");
        int num1 = input.nextInt();

        System.out.println("Enter Your Second Number : ");
        int num2 = input.nextInt();

        int num3 = num2;
        num2 = num1 ;
        num1 = num3;

        System.out.println("After Swapping  Numbers  is : " + num1);
        System.out.println("After Swapping Numbers is : "+ num2);
    }

}
