package FunctionalAndProgramming.Lambda;

import java.util.Scanner;

public class OddEvenL {
    //Odd Even using Lambda 
  @FunctionalInterface 
  interface Check{
    boolean test(int n);

  }
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter Your number : ");
    int num = input.nextInt();

    Check even = x-> x%2==0;

    if(even.test(num)){
        System.out.println("Odd");
    }else{
        System.out.println("Even");
    }
  }

}
