package ControlAndStatementAndMath.ChallengeLoops;

import java.util.Scanner;

public class PasswordChecker {
    // public static void main(String[] args) {
    //     Scanner input = new Scanner(System.in);
    //     // Password Checker

    //     System.out.println("Welcome in the Password Checker ");

    //      String password ;

    //     do{
    //         System.out.print("Enter Your Password : ");
    //          password = input.next();
    //     }while(!isValidPassword(password));
    //     System.out.println("Thanks for entering valid password ");


    // }
    // public static boolean isValidPassword(String password){

    //     return password.length() > 6;
    // }
    // public static void main(String[] args) {
    //     Scanner input = new Scanner(System.in);
    //     System.out.println("Welcome int the Password Checker ");

    //     String password;
    //     do{
    //         System.out.println("Enter your Password : ");
    //         password = input.next();

    //     }while(!isValidPassword(password));
    //     System.out.println("Thanks for entering valid password ");
    // }
    // public static boolean isValidPassword(String password){
    //     return password.length()> 6;
    // }
    // public static void main(String[] args) {
    //     Scanner input = new Scanner(System.in);
    //     System.out.println("Welcome in the Password Checker ");
    //      String password;

    //      do{
    //         System.out.print("Enter Your Password : ");
    //         password = input.next();

    //      }while(!isValidPssword(password));
    //      System.out.println("Thanks for entering Valid Password ");
    // }
    // public static boolean isValidPssword(String password){
    //     return password.length()>6;
    // }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    //     System.out.println("Welcome in the password Checker ");

    //     String password;

    //     do{
    //         System.out.print("Enter Your Password : ");
    //         password = input.next();
    //     }while(!isValidPassword(password));
    //     System.out.println("Thanks for Entering Valid Password ");
    // }
    // public static boolean isValidPassword(String password){
    //     return password.length()>6;

    System.out.println("Welcome in the Password Checker");

    String password;
    do{
        System.out.print("Enter Your Password : ");
        password = input.next();
    }while(!isValidPassword(password));
    System.out.println("You Enter Valid Password ");
    }
    public static boolean isValidPassword(String password){
        return password.length()>6;
    }
}
