package BitwiseOperater;

import java.util.Scanner;

public class Bitwise {
    public static void main(String[] args) {
        //Operaters

        //And & 
        //or |
        //xor ^
        //not ~
        //left shift <<
        //right shift >>
        //unsinged right shift >>>

        // and & 
        // int c = 5& 4;
        // System.out.println(Integer.toBinaryString(5));
        // System.out.println(Integer.toBinaryString(4));
        // System.out.println(Integer.toBinaryString(c));
        // System.out.println(c);
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your First Number : ");
        int first = input.nextInt();

        System.out.println("Enter your second Number : ");
        int second = input.nextInt();

        int result = first & second;
        System.out.println("Your result is : " + result);

    }

}
