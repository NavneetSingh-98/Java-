package ControlAndStatementAndMath.ChallengeLoops;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        
        // Fibonacci Series upto certain Numbers
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to printing fibonacci series ");

        System.out.print("Enter The number of element to be printed : ");
        int count = input.nextInt();

        for(int i = 1; i<= count; i++){
            System.out.println(fibbonacci(i) + " ");
        }
    }
    public static int fibbonacci(int position){
        System.out.print(".");

        if(position == 1){
            return 0;
        }if(position ==2 ){
            return 1;
        }

        
        return fibbonacci(position -1) + fibbonacci(position -2);

    }

}
