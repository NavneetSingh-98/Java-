package ControlAndStatementAndMath.Challenge;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
// In positive value will be positive 
     // but in user enter negative value absolute value convert into Positive value 

        System.out.println("Enter Your Number : ");
        int num = input.nextInt();

        int reslut = num >= 0 ? num : -num;
        System.out.println(reslut + " is your absoulte value");
    }

}
