package ControlAndStatementAndMath.SwitchCase;

import java.util.Scanner;

public class NewCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome in the New Switch Case ");
        System.out.print("Enter Your Days : ");
        int day = input.nextInt();

        String  dayStr = switch(day){
            case 1-> "Monday";
            case 2-> "Tuesday";
            case 3-> "Wednesday";
            case 4 -> "Thrusday";
            case 5 -> "Firday";
            case 6 -> "Satuday";
            case 7 -> "Sunday";
            default -> "Invalid day";
        };
        System.out.println(dayStr);
    }

}
