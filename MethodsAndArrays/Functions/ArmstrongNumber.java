package MethodsAndArrays.Functions;

import java.util.Scanner;

public class ArmstrongNumber {

     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        // Armstrong Finder 

        // example - 153 ( 3 ) - 1
        System.out.println("Welcome in the Armstrong ");

        System.out.print("Enter Your Number : ");
        int num = input.nextInt();

        boolean isArmstrong = isArmstrong(num);
        System.out.println(isArmstrong);
        if(isArmstrong){
            System.out.println("Your number is Armstrong");
        }else{
            System.out.println("Your number is Not Aramstrong ");
        }
    }
    public static boolean isArmstrong(int num){
        int noOfDigits = noOfDigits(num);
        int numCopy = num;
        System.out.println("No Of Digits : " + noOfDigits);
        int finalNumber = 0;
        while(num > 0){
            int lastDigits = num % 10;
            num = num / 10;
            finalNumber += power(lastDigits, noOfDigits);
        }
        System.out.println("final number is :  " + finalNumber);

        return finalNumber == numCopy;

    }
    public static int power(int num1, int num2){
        int result = 1;
        int i = 0;
        while(i< num2){
            result = result * num1;
            i++;
        }

        System.out.println("Pow of "+ num1 + " is " + num2);

        return result;
    }

    // Sepreate digits with the help of this methods

    public static int noOfDigits(int num){
        int digit = 0;
        while(num >0){
            digit++;
            num = num /10;
        }
        return digit;
    }

}
