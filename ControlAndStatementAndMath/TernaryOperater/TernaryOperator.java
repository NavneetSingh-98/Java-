package ControlAndStatementAndMath.TernaryOperater;

import java.util.Scanner;

public class TernaryOperator {
    // public static void main(String[] args) {
    //     Scanner input = new Scanner(System.in);
    //     System.out.println("Welcome in the Number Checker ");

    //     System.out.print("Enter Your First Number : ");
    //     int first = input.nextInt();

    //     System.out.print("Enter Your  Second Number : ");
    //     int second = input.nextInt();

    //     // if(first > second){
    //     //     System.out.println("First Number is Greater ");
    //     // }else{
    //     //     System.out.println("Second Number is Greater ");
    //     // }

    //     int greaterNumber = first > second ? first : second;
    //     System.out.println(greaterNumber + " is the greater number ");

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your First Number : ");
        int first = input.nextInt();

        System.out.println("Enter Your Second Number : ");
        int second = input.nextInt();

        // if(first > second){
        //     System.out.print("First number is Greater ");
        // }else{
        //     System.out.print("Second Number is Greater ");
        // }
        int greaterNumber = first > second ? first : second ;
        System.out.println(greaterNumber + " is the greater Number ");
    }
    }


