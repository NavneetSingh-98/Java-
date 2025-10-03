package ControlAndStatementAndMath.ChallengeLoops;

import java.util.Scanner;

public class Palindrome {
    // public static void main(String[] args) {
    //     Scanner input = new Scanner(System.in);
        
    //     // Palindrome using Recursion 
    //     System.out.println("Welcome in the Palindrome Checker ");
    //     System.out.print("Enter Your String  : ");
    //     String str = input.next();
    //     boolean isPalindrome = isPalindrome(str);

    //   System.out.println("Your String is " 
    //                      + ((isPalindrome(str) ? "Palindrome" 
    //                      : "Not Palindrome")));
    // }
    // public static boolean isPalindrome(String str){
    //     if(str.length() <= 1){
    //         return true;
    //     }
    //     int lastPos = str.length() - 1;
    //     if(str.charAt(0) != str.charAt(lastPos)){
    //         return false;
    //     }
    //     String newStr  = str.substring(1, lastPos);

    //     return isPalindrome(newStr);

    // }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your String : ");
        String str = input.next();
         boolean isPalindrome= isPalindrome(str);
         if(isPalindrome){
            System.out.println("Your String is Palindrome ");
         }else{
            System.out.println("Your String is Not Plaindrome");
         }

    }
    public static boolean isPalindrome(String str){
        if(str.length() <=1){
            return true;
        }
        int lastPos = str.length()-1;
        if(str.charAt(0) != str.charAt(lastPos)){
            return false;
        }String newStr  = str.substring(1,lastPos);
        return isPalindrome(newStr);
    }

}
