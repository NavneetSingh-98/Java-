package FunctionalAndProgramming.Lambda;

import java.util.Scanner;

public class AddN {
    //Lambda --> A Lambda expression is a short way to implement Funtional Interface 
    // (parameter) -> expresion  Or (parameter) -> {  statement     }

    //Add Two Numbers using lambda 

@FunctionalInterface 
interface Calculater{
    int calculate(int a , int b);
}
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Your First Value : ");
    int num1 = input.nextInt();

    System.out.println("Enter Your Second Number : ");
    int num2 = input.nextInt();

    Calculater add = (a,b) -> num1 + num2;
    System.out.println("Sum "+ add.calculate(num1, num2));
}


}
