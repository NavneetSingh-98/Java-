package ControlAndStatementAndMath.TernaryOperater;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your First Number : ");
        int num1 = input.nextInt();

        System.out.println("Enter Your Second number : ");
        int num2 = input.nextInt();

        int greaterAge = num1 > num2 ? num1 : num2;
        System.out.println(greaterAge + " greater age ");
    }

}
