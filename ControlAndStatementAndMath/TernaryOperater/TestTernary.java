package ControlAndStatementAndMath.TernaryOperater;

import java.util.Scanner;

public class TestTernary {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Number  : ");
        int num1 = input.nextInt();

        System.out.print("Enter Your Second Number  : ");
        int num2 = input.nextInt();

        int greaterNumber = num1 > num2 ? num1 : num2;
        System.out.println(greaterNumber + " is Greater Number "); 
    }

}
