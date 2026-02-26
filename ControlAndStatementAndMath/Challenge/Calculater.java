package ControlAndStatementAndMath.Challenge;

import java.util.Scanner;

import ControlAndStatementAndMath.ChallengeLoops.readInput;

public class Calculater {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your First Number : ");
        int first  = input.nextInt();

        System.out.println("Enter your Second Number : ");
        int second = input.nextInt();

        System.out.println("Enter Your operation ");
        String opretion = input.next();

        int result = switch(opretion){
            case "+" -> first  + second;
            case "-" -> first - second;
            case " *" -> first * second;
            case "/" -> first / second;
             default -> -1;

        };
        System.out.println("Your result is "+  result);
    }

}
