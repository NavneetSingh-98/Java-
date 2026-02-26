package ControlAndStatementAndMath.TernaryOperater;

import java.util.Scanner;

public class TestTurnery {
    public static void main(String[] args) {
        System.out.println("Welcome in JAVA ");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your First Number : ");
        int first = input.nextInt();

        System.out.println("Enter Your second Number : ");
        int second = input.nextInt();

        int greatNumber = first > second ?  first : second;
        System.out.printf(greatNumber+ " greater Number ");
    }

}
