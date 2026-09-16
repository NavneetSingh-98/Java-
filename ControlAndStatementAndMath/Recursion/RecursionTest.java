package ControlAndStatementAndMath.Recursion;

import java.util.Scanner;

public class RecursionTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("***** Welcome in Recursion  *****");

        System.out.println("Enter Your Number ...");
        int num = input.nextInt();

        long findFca = findFcato(num);
        System.out.println(findFca);




    }
    public static long findFcato(int num){
        if(num == 0){
            return 1;
        }
        return  num * findFcato(num - 1);
    }
    
}
