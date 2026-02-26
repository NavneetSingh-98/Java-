package ControlAndStatementAndMath.Challenge;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // System.out.print("Enter Your Number  : ");
        // int num = input.nextInt();

      
        // String OddEven = num % 2 ==0 ? "Even" : "Odd";

        // System.out.println(OddEven + " Is Your Number");

        System.out.println("Enter Your Number : ");
        int num = input.nextInt();

        String oddEven = num % 2 == 0 ? "even" : "odd";
        System.out.println("Your number is : "+ oddEven);


    }

}
