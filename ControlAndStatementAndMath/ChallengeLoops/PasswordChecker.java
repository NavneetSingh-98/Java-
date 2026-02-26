package ControlAndStatementAndMath.ChallengeLoops;

import java.util.Scanner;

public class PasswordChecker {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome in the Password Checker ");
    String password;
    do{
        System.out.println("Enter Your Password : ");
        password = input.next();
    }while(!isValidPassword(password));
    System.out.println("You enter a valid password ");
}
public static boolean isValidPassword(String password){
    return password.length() > 8;
}
}
