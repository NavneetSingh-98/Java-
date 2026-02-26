package ControlAndStatementAndMath.Challenge;

import java.util.Scanner;

public class MinimumNumber {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter Your First Number : ");
    int num1 = input.nextInt();

    System.out.println("Enter Your Second Number : ");
    int num2 = input.nextInt();

    int maximum = num1 > num2 ? num1 : num2;
    System.out.println("maximun number is "+ maximum);

}
  

}
