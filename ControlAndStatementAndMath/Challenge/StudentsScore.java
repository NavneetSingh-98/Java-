package ControlAndStatementAndMath.Challenge;

import java.util.Scanner;

public class StudentsScore {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // System.out.print("Enter Your Score : ");
        // int score = input.nextInt();

        // String result = score > 80 ? " High"  : (score >  50 ?  "Moderate" : "Low"); 
        // System.out.println("Your Score  is : " + result);

        System.out.print("Enter Your Marks : ");
        int marks = input.nextInt();

        String result = marks > 80 ? "High" : (marks > 50 ?  " Moderate" : "Low");
        System.out.println("Your score is : "+ result);
    }
}
