package ControlAndStatementAndMath.ChallengeLoops;

import java.util.Scanner;

public class NumberGussing {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // int num = 8 , guess;
    // do{
    //     System.out.print("Enter Your Number Betwwen 0 to 10 : ");
    //     guess = input.nextInt();
    // }while(num != guess);
    // System.out.println("You have Succesfully Gussed the Number ");

    int num = 7, guess;
    do{
        System.out.println("Enter Your Number Between 0 to 10 : ");
        guess = input.nextInt();
    }while(num != guess);
    System.out.println("You have succesfully guess the Number ");
 }
}
