package ControlAndStatementAndMath.Challenge;

import java.util.Scanner;

public class AbsoluteValue {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Your Number : ");
    int num = input.nextInt();

    int absoluteNumber = num >= num ? num : -num;
    System.out.println(" Your number is absoulte: "+ absoluteNumber);
  }

}
