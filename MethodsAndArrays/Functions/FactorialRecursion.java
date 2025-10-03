package MethodsAndArrays.Functions;

import java.util.Scanner;

public class FactorialRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome in the Factoril Finder ");

        System.out.print("Enter Your Number : ");
        int num = input.nextInt();

        long result  = factorilRecursion(num);

        System.out.println("Factoril of "+ num + "=" + result);


    }
    public static long  factorilRecursion(int num){
        if(num ==0 || num == 1)
        return 1;
        return num * factorilRecursion(num -1);

    }


    }
    

