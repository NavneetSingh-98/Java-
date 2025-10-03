package MethodsAndArrays.Functions;

import java.util.Scanner;

public class MultiplecationTable {

    //  public static void main(String[] args) {
    //     // Multiplecation Table 
    //     Scanner input = new Scanner(System.in);

    //     System.out.print("Enter Your Number : ");
    //     int num = input.nextInt();

    //     for(int i= 1; i<= 10 ; i++){
    //         System.out.println(num +"*"+ i + "=" + num *i);
    //     }
        
    //  }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Number : ");
        int num = input.nextInt();

        for(int i=1; i<=10; i++){
            System.out.println(num +"x"+i+"="+num *i);
        }
    } 
}
