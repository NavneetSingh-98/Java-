package ControlAndStatementAndMath.ChallengeLoops;

import java.util.Scanner;

public class MultiplecationTable {
    public static void main(String[] args) {
        
        // Multiplecation Table
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome in the Multiplecation Table Program ");

        System.out.print("Enter Your Number : ");
        int num = input.nextInt();

        for(int i = 1; i<= 10; i++){
            System.out.println(i + "x" + num + "=" +  (num * i));
        }

    }

}
