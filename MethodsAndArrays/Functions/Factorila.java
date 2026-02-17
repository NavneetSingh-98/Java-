package MethodsAndArrays.Functions;

import java.util.Scanner;

public class Factorila {

    //  public static void main(String[] args) {
        
    //     // Factorial - example , 5! = 5* 4 * 3 * 2 *1 = 120

    //     Scanner input = new Scanner(System.in);

    //     System.out.println("Welcome in the Factroial");

    //     System.out.print("Enter Your Number : ");
    //     int num = input.nextInt();

    //     long fact = FindFacto(num);
    //     System.out.print("Your Factorial is : " + fact);

    // }
    // public static long FindFacto(int num){
    //     if(num < 2){
    //         return 1;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
    //     }
    //     long fact = 1;
    //     int i = 2;
    //     while(i <= num ){
    //         fact = fact * i;
    //         i++;
    //     }
    //     return fact;
    // }

    public static void main(String[] args) {
    //     Scanner input = new Scanner(System.in);
    //     System.out.println("Welcome int he Factoril Finder");

    //     System.out.print("Enter Your Number : ");
    //     int num = input.nextInt();

    //     long fact = FindFcato(num);
    //     System.out.printf("Your factoril is : %d", fact);

    // }
    // public static long FindFcato(int num){

    //     if(num < 2){
    //         return 1;
    //     }
    //     long fact = 1;
    //     int i=2;
    //     while(i <= num){
    //         fact = fact * i;
    //         i++;
    //     }
    //     return fact;
    // Scanner input = new Scanner(System.in);
    // System.out.println("Enter Your Number : ");
    // int num = input.nextInt();

    // long fact = findFactoril(num);
    // System.out.println("Factorila is : "+ fact);
    
    
    // }
    // public static long findFactoril(int num){
    //     if(num <2){
    //         return 1;
    //     }
    //     long fact = 1; 
    //     int i = 2;
    //     while(i <= num){
    //         fact = fact*i;
    //         i++;
    //     }
    //     return  fact;

    Scanner input = new Scanner(System.in);
    System.out.print("Enter Your Number : ");
    int num = input.nextInt();

    long fact = FindFact(num);

    System.out.println("Your Fact is : "+ fact);  
    }
    public static long FindFact(int num){

        if(num == 0 || num == 1){
            return 1;

        }
        long fact = 1; 
        int i = 2;
        while (i <= num) {
            fact = fact * i;
            i++;
            
        }
        return fact;

    }
     
}
