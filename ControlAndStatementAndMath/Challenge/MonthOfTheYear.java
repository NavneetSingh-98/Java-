package ControlAndStatementAndMath.Challenge;

import java.util.Scanner;

public class MonthOfTheYear {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Months : ");
        int month = input.nextInt();

        String strMonths = switch(month){
            case 1 -> "January";
            case 2 -> "Feburary";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "Auguest";
            case 9 -> "September";
            case 10 -> "Octuber";
            case 11-> "November";
            case 12-> "December";
            default -> "Invalid Mothes ";
            
        };
        System.out.println(strMonths);

    }

}
