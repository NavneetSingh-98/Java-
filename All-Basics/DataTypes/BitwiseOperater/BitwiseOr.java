package BitwiseOperater;

import java.util.Scanner;

public class BitwiseOr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your first Number : ");
        int first = input.nextInt();

        System.out.println("Enter Your Second Number : ");
        int second = input.nextInt();

        int result = first | second;
        System.out.println("Your result is : "+ result);
    }
    
}
