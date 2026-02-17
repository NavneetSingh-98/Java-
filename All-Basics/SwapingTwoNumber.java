import java.util.Scanner;

public class SwapingTwoNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Welcome in the Swapping 
        System.out.print("Enter Your num1 : ");
        int num1 = input.nextInt();

        System.out.print("Enter Your num2 : ");
        int num2 = input.nextInt();
        
        int num3 = num1;
        num1 = num2;
        num2 = num3;
        System.out.println("After Swapping Your Number num1 is "+ num1);
        System.out.println("After Swapping Your Number num2 is "+ num2);

    }

}
