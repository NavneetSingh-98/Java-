package ControlAndStatementAndMath.ChallengeLoops;

import java.util.Scanner;

import MethodsAndArrays.AdvanceArrayQuestion.ArrayUtility;

public class sumPositiveNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Sum All positive Number 

        System.out.println("Welcome to adding positive Number ");

        int[] numArr = ArrayUtility.inputArray(); 

        // Sum all Positive Number       

        int sum = 0;   
        for(int num : numArr){
            if(num < 0){
                continue;
            }
            sum = sum + num;
        }
        System.out.println("The sum of positive number is : " + sum );
    }

}
