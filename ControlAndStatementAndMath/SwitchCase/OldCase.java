package ControlAndStatementAndMath.SwitchCase;

import java.util.Scanner;

public class OldCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome in the Old Switch Case ");

        System.out.print("Enter your days : ");
        int days = input.nextInt();

        switch (days) {
            case 1:
                System.out.println("Monday ");
                break;
                  case 2:
                System.out.println("Tuesday ");
                break;
                  case 3:
                System.out.println("Wednesday ");
                break;
                  case 4:
                System.out.println("Thrusday");
                break;
                  case 5:
                System.out.println("Friday ");
                break;
                  case 6:
                System.out.println("Saturday ");
                break;
                  case 7:
                System.out.println("Sunday ");
                break;
        
            default:
                System.out.println("Invalid Day ");
                break;
        }
    }

}
