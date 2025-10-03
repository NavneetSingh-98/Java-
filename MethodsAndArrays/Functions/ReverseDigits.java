package MethodsAndArrays.Functions;

import java.util.Scanner;

public class ReverseDigits {

      public static void main(String[] args) {
        
        // Reverse Digit Program 

    //     Scanner input = new Scanner(System.in);
    //     System.out.print("Enter Your Digits : ");
    //     int num = input.nextInt();

    //     int reverse = ReverseDigit(num);
    //     System.out.println("Your reverse Digit is : " + reverse);


    // }
    // public static int ReverseDigit(int num ){
    //     int newNum = 0;
    //     while(num > 0){
    //         int digit = num % 10;
    //         newNum =  newNum * 10 + digit;
    //         num = num /10;
    //     }
    //     return newNum;

    Scanner input = new Scanner(System.in);
    System.out.println("Enter Your Number : ");
    int num = input.nextInt();

    int reverse = reverseDigit(num);
    System.out.println("Your Reversed Number is : " + reverse);


    }
    public static int reverseDigit(int num){
        int newNum = 0; 
        while(num > 0){

            int digit = num %10;
            newNum = newNum * 10 + digit;
            num = num /10; 
        }
        return newNum;
    }

}
