import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        
        // Leap Yera Finder 
    //     Scanner input = new Scanner(System.in);

    //     System.out.print("Enter Your Year : ");
    //     int year = input.nextInt();

    //     if(year % 4 ==0){
    //         System.out.println("Year is Leap Year");
    //     }else if(year % 100 == 0){
    //         System.out.println("Year is not Leap Year ");
    //     }else{
    // System.out.println("Year is not Leap Year ");
    //     }
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Your Number : ");
    int year = input.nextInt();

    if(year % 4 ==0){
        System.out.println("Year is Leap Year ");
    }else if(year % 100 == 0){
        System.out.println("Year Is Not Leap Year ");
    }else{
        System.out.println("Year is Not leap Year ");
    }
    }

}
