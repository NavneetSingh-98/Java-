package ControlAndStatementAndMath.ChallengeLoops;

import java.util.Scanner;

import MethodsAndArrays.AdvanceArrayQuestion.ArrayUtility;

public class MaximumValue {
    public static void main(String[] args) {
        // Maximum value in an integer array 
    System.out.println("Welcome in the Finding maximum array ");

     int[] numArr = ArrayUtility.inputArray();

     int max = Integer.MIN_VALUE;
     for(int num : numArr){
        if(max < num){
            max = num;
        }
     }
     System.out.println("Maximum number is : " + max);
     
    }

}
