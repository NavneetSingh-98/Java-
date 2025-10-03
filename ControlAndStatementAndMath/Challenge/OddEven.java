package ControlAndStatementAndMath.Challenge;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // System.out.print("Enter Your Number  : ");
        // int num = input.nextInt();

      
        // String OddEven = num % 2 ==0 ? "Even" : "Odd";

        // System.out.println(OddEven + " Is Your Number");

        System.out.print("Enter Your Number : ");
        int num = input.nextInt();

        String OddEven = num % 2==0 ?" odd ": "even";
        System.out.println("Your Number is : "+ OddEven);
    }

}
