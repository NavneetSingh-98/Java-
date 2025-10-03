package MethodsAndArrays.Functions;

import java.util.Scanner;

public class Palindrome {

     public static void main(String[] args) {
        
        // Palindrome - NITIN -< -> NITIN 

    //     Scanner input = new Scanner(System.in);
    //     System.out.println("Welcome in the Palindrome Finder ");

    //     System.out.print("Enter Your Number : ");
    //     int num  = input.nextInt();

    //      boolean IsPalindrome = IsPalindrome(num);
    //     if(IsPalindrome){
    //         System.out.println("Your Number is Palindrome ");
    //     }else{
    //         System.out.println("Your Number is Not Palindrome ");
    //     }

    // }
    // public static boolean IsPalindrome(int num){
    //     return num == reverse(num);
    // }
   
    
    // public static int reverse(int num){
    //     int newNum = 0;
    //     while(num > 0){
    //         int digit = num % 10;
    //         newNum = newNum * 10 + digit;
    //         num = num / 10;
    //     }
    //   return newNum;
    // }
      Scanner input = new Scanner(System.in);
      System.out.println("Enter YOUR Number : ");
      int num = input.nextInt();

      boolean IsPalindrome = IsPalindrome(num);

      if(IsPalindrome){
        System.out.println("Your Number is Palindroem ");
      }else{
        System.out.println("Your Number is not Palindrome ");
      }


     }
     public static boolean IsPalindrome(int num){
        return num == reverse(num);

     }
     public static int reverse(int num){
        int newNum = 0;
        while(num > 0){
            int digit = num % 10;
            newNum = newNum*10 + digit;
            num = num /10;
        }
        return newNum;
     }
}
