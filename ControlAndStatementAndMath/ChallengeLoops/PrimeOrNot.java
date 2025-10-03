package ControlAndStatementAndMath.ChallengeLoops;

import java.util.Scanner;

public class PrimeOrNot {
    // public static void main(String[] args) {
        
    //     // Find prime Or Not 
    //     Scanner input = new Scanner(System.in);
    // System.out.println("Welcome in the Prime Number Finder ");

    // System.out.print("Entre Your Number : ");
    // int num = input.nextInt();

    // System.out.println("Your number is " + (isPrime(num) ? " Prime" : " Not Prime"));

    

    // }
    // public static boolean isPrime(int num ){

    //     for(int i = 2; i< num; i++){
    //         if(num % i == 0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int num = input.nextInt();
        System.out.println("Your Number is " + (isPrime(num) ? "Prime" : "Not Prime"));
    }
    public static boolean isPrime(int num){
        for(int i= 2; i<= num; i++){
            if(num %i == 2){
                return false;
            }
        }
        return true;

    }
}
