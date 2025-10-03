package MethodsAndArrays.Functions;

import java.util.Scanner;

public class SumOdd {

    public static void main(String[] args) {
    //     Scanner input = new Scanner(System.in);

    //     System.out.println("Welcome in the Sum of Odd Numbers ");

    //     System.out.print("Enter Your Number : ");
    //     int num = input.nextInt();
    //     int sum= SumOfOdd(num);
    //     System.out.println("Your Sum of Odd Number is : " + sum);
    // }
    // public static int SumOfOdd(int num){
    //     int sum = 0;
    //     int i = 0;

    //     while(i <= num){
    //         sum = sum + i;
    //         i = i+ 2;


    //     }
    //     return sum;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Your Number : ");
    int num = input.nextInt();
    int sum = OddSum(num);
    System.out.println("Your Odd Sum is : "+ sum);

    }
    public static int OddSum(int num){
        int sum = 0;
        int i = 0;
        while(i <= num ){
            sum = sum + i;
            i = i+2;
        }
        return sum;
    }


}
