package MethodsAndArrays.Functions;

import java.util.Scanner;

public class PrimeOrNot {

     public static void main(String[] args) {
        
    //     // Find Number is Prime Or Not 

    //     Scanner input = new Scanner(System.in);
    //     System.out.println("Welcome in the  Prime Number Finder");
    //     System.out.print("Enter Your Number : ");
    //     int num = input.nextInt();

    //     boolean IsPrime = IsPrime(num);

    //     if(IsPrime){
    //         System.out.println("Your Number is Prime ");
    //     }else{
    //         System.out.println("Your Number is Not Prime");
    //     }
    // }
    // public static boolean IsPrime(int num){
    //     for(int i= 2; i< num; i++){
    //         if(num % i ==0){
    //             return false;
    //         }

    //     }
    //     return true;
    // Scanner input = new Scanner(System.in);

    // System.out.println("Enter Your Number : ");
    // int num = input.nextInt();
    // boolean isPrime = IsPrime(num);

    // if(isPrime){
    //     System.out.println("Number is Prime ");
    // }else{
    //     System.out.println("Number is Not Prime");
    // }

    // }
    // public static boolean IsPrime(int num){
    //     for(int i=2; i<num ; i++){
    //         if(num %2 == 0){
    //             return false;
    //         }
    //     }
    //       return true;
    // }
  
Scanner input = new Scanner(System.in);
System.out.println("Enter Your Number : ");
int num = input.nextInt();

boolean isPrime = isPrime(num);
if(isPrime){
    System.out.println("Number is Prime");
}else{
    System.out.println("Number is Not Prime ");
}



}
public static boolean isPrime(int num){
    for(int i= 2; i<= num; i++){
        if(num %2 == 0){
            return false;
        }
    }
    return true;

}
}
