package MethodsAndArrays.Functions;

import java.util.Scanner;

public class FactoRec {
    public static void main(String[] args) {
        System.out.println("Welcome in the Facprial Finder Program ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter  Your Number : ");
        int num = input.nextInt();
        long fact = facto(num);
        System.out.println("Factoril of "+ num + " =" + fact );

    }
    public static long facto(int num){
        if(num == 0 || num ==1){
            return 1;
        }
        return num * facto(num -1);
    }

}
