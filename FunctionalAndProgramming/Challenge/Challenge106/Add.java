package FunctionalAndProgramming.Challenge.Challenge106;

import java.util.Scanner;
import java.util.function.BinaryOperator;

public class Add {
    // public static void main(String[] args) {
        
    //     BinaryOperator<Integer> add = (a,b) -> a+b;
    //     int result = add.apply(5, 5);
    //     System.out.println(result);
    // }

    @FunctionalInterface 
      interface Calculater{
      int  calculate(int a , int b);
      }

      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your First Number : ");
        int first = input.nextInt();

        System.out.println("Enter Your Second Number : ");
        int second = input.nextInt();

        Calculater add = (a , b) -> first + second;
        System.out.println("Sum : " + add.calculate(first, second) );
      }

}
