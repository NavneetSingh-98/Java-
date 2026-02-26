package ControlAndStatementAndMath.ChallengeLoops;

import java.util.Scanner;

public class NumberGussing {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);


    int num = 8, guess;
    do{
        System.out.println("Enter Your Number between 0 to 10 ");
        guess = input.nextInt();
        
    }while(num != guess);
    System.out.println("You succesfully guess the Number ");

 }
}
