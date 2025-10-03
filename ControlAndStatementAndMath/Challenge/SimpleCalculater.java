package ControlAndStatementAndMath.Challenge;

import java.util.Scanner;

public class SimpleCalculater {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your First Number  : ");
        int num1 = input.nextInt();

        System.out.print("Now Enter Your Second Number : ");
        int num2 = input.nextInt();

        System.out.print("Now Enter Your Operation: ");
        String operation = input.next();

    int result = switch(operation){
        case "+" -> num1 + num2;
        case "-" -> num1 - num2;
        case "*" -> num1 * num2;
        case "/" -> num1 / num2;
        default -> -1;

    };
    System.out.println("Your answer is : " +  result);


    }

}
