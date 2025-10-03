package ControlAndStatementAndMath.Loops;

import java.util.Scanner;

public class doWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int age ;
        do{
            System.out.print("Enter Your age : ");
            age = input.nextInt();
        }while(age < 0 || age > 100);

        System.out.println("Your age is : " + age);
    }

}
