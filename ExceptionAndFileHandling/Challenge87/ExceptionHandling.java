package ExceptionAndFileHandling.Challenge87;

import java.util.Scanner;

public class ExceptionHandling {
 public static void main(String[] args) {
    System.out.println("Welcome in the Exception File Handling ");
    Scanner input = new Scanner(System.in);

    System.out.print("Enter Your First Number : ");
    int first = input.nextInt();

    System.out.print("Enter Your Second Number : ");
    int second  = input.nextInt();

    try{
        int result = first / second;
        System.out.printf("Your result is : %d",result);
    }catch(ArithmeticException e){
        System.out.printf("%s ,Enter Valid Number ",e.getMessage());
    }
    finally{
        System.out.println(" \nI am Finally So am Also Run ");
    }
   
 }

}
