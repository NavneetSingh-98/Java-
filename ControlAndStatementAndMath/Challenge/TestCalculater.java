package ControlAndStatementAndMath.Challenge;

import java.util.Scanner;

public class TestCalculater {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome in the Arithmatic Calculater ");

        System.out.println("Enter Your First  Num1 : ");
        int num1 = input.nextInt();

        System.out.println("Enter Your Second Num2 : ");
        int num2 = input.nextInt();

        System.out.println("Now entre Your Operation ");
        String operation = input.next();

        int result = switch(operation){
            case "+" -> num1 + num2;
            case "-" -> num1 -num2 ;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2 ;
            default -> -1;
       };

       System.out.println("Your Result is : " + result);

        
    }

}
