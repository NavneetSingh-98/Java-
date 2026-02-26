package ControlAndStatementAndMath.Recursion;

import java.util.Scanner;

public class TestRecursion {
    // public static void main(String[] args) {
        
    //     // Self calling Function is called Recursion .   

    //     Scanner input = new Scanner(System.in);
    //     System.out.print("Enter Your Number:  ");
    //     int num = input.nextInt();
    //     // long fact = FactorialFinder(num);
    //     long fact=  factorial(num);
    //     System.out.println("Your Fcatorial is : " + fact);

    // }
    // public static long FactorialFinder(int num){

    //     long result  = 1;
    //     for(int i = 1; i<= num; i++){
    //         result *= i;
    //     }

    //     return result;
    // }

    // Recusrion

    // public static long factorial(int num){
    //             // System.out.println("Function called for : " + num);
    //     if(num == 1){
    //         return 1;

    //     }
    //     return num * factorial(num-1);
    // }

 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Welcome in Java ");

    System.out.println("Enter Your Number : ");
    int num = input.nextInt();
    long fact = findFacto(num);
    System.out.println("Your factorial is : " + fact);

 }
 public static long findFacto(int num){
    if(num == 0){
        return 1;

    }
    return num * findFacto(num -1);
 }
}
