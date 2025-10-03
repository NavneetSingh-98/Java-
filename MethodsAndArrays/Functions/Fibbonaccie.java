package MethodsAndArrays.Functions;

import java.util.Scanner;

public class Fibbonaccie {

//      public static void main(String[] args) {
        
//         // Fibbonacci Series - 0,1,1,2,3,5,8,.

//         Scanner input = new Scanner(System.in);
//         System.out.println("Welcome in the Fibbonacci Series");

//         System.out.print("Enter Your Number : ");
//         int num = input.nextInt();

//    System.out.println("Here is the fibbonacci series : ");
//    Fibbonacci(num);
//     //  System.out.println("Your Fibbonaccie Number is : " + Fibbonaccie(num));
//     }
//     public static  void Fibbonacci(int num){

//         // Base Case 
//         if(num < 0) return;
//         System.out.println("0");
        
//         if(num ==0) return;
//             System.out.println("1");
        
//         // Main Case 

//         int first = 0;
//         int second = 1;
//         while(first + second <= num){
//             int third = first + second;
//             System.out.println(third +" "); 
//             first = second;
//             second= third;
//         }

//     }
public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter Your Number : ");
       int num = input.nextInt();

       System.out.println("Your Fibbonaccii Number is : ");
       FibbonacciNumber(num);
    
}
public static void FibbonacciNumber(int num){

    if(num <0)return;
    System.out.println("0");

    if(num ==0) return;
    System.out.println("1");

    int first = 0;
    int second = 1;

    while(first + second <= num){
        int third = first + second;

        System.out.println(third + " ");
        first = second; 
        second = third;
    }

}

}
