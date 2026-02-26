package ControlAndStatementAndMath.ChallengeLoops;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome in the Number Checker ");
        System.out.println("Enter Your Number : ");
        int num = input.nextInt();
        boolean isPrime = isPrime(num);
         if (isPrime){
            System.out.println("Number is Prime");
        }else{
            System.out.println("Number is not prime ");
        }
        
        

    }
    public static boolean isPrime(int num){
        for(int i = 2; i<num;  i++){
            if(num %i ==2){
                return true;
            }
            // return true;
        }
        return false;
    }
 

    
}
