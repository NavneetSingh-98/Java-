package ControlAndStatementAndMath.Challenge;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // System.out.print("Enter Your First  Number : ");
        // int num = input.nextInt();

        // System.out.print("Enter Your Second Number : ");
        // int num2 = input.nextInt();

        // int greaterNumber = num > num2 ? num : num2;
        // System.out.println(greaterNumber + " is greater number ");
        
        System.out.print("Enter Your First Number : ");
        int num = input.nextInt();

        System.out.print("Enter Your Second Number : ");
        int num2 = input.nextInt();

        int greatNumber = num > num2 ? num : num2;
        System.out.println(greatNumber + " is your great Number ");


    }

}
