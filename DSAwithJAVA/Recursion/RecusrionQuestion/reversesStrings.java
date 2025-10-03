package DSAwithJAVA.Recursion.RecusrionQuestion;

import java.util.Scanner;

public class reversesStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your String : ");
        String str = input.next();

        reverseString(str, str.length()-1);

    }
    public static void reverseString(String str , int idx){
        if(idx == 0){
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        reverseString(str, idx-1);
    }

}
