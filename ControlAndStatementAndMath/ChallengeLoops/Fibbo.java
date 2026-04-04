package ControlAndStatementAndMath.ChallengeLoops;

import java.util.Scanner;

public class Fibbo {
    public static void main(String[] args) {
        // Fibbonacci Series 
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your Number : ");
        int num = input.nextInt();

        for(int i = 1; i<= num; i++){
            System.out.println(" Your Fibbonacci number is " + Fibbonacci(i));
        }

    }

    public static int Fibbonacci(int num){
        if(num == 1){
            return 0;
        }
        if(num ==2){
            return 1;
        }
        return Fibbonacci(num - 1) + Fibbonacci(num - 2);
    }

}
