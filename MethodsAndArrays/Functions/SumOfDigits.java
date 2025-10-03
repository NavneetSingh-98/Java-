package MethodsAndArrays.Functions;

import java.util.Scanner;

public class SumOfDigits {

     public static void main(String[] args) {
        
    //     // Sum of Digits 
    //     Scanner input = new Scanner(System.in);
    //     System.out.print("Enter Your Number  : ");
    //     int num = input.nextInt();

    //     int sumDigits = SumOfDigit(num);
    //     System.out.println("Sum of digits is : " + sumDigits);

    // }
    // public static int SumOfDigit(int num){
    //     int sum = 0;
    //     while (num> 0) {
    //         sum = sum + num /10;
    //         num = num /10;
            
    //     }
    //     return sum;

    Scanner input = new Scanner(System.in);
    System.out.println("Enter Your Number : ");
    int num = input.nextInt();

    int sumOfDigit = SumOfDigits(num);
    System.out.println("Sum of digits is : "+ sumOfDigit);


    }
    public static int SumOfDigits(int num){
        int sum = 0;
        while(num > 0){
            sum = sum + num /10;
            num = num /10;

        }
        return sum;
    }


}
