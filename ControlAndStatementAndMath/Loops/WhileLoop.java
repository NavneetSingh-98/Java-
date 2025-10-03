package ControlAndStatementAndMath.Loops;

import java.util.Scanner;

public class WhileLoop {
//     public static void main(String[] args) {
        
//         Scanner input = new Scanner(System.in);

//         System.out.print("Please enter Your age : ");
//         int age = input.nextInt();

// while(age < 10|| age > 100){
//       System.out.print("Please enter Your age : ");
//         age = input.nextInt();

// }
// System.out.println("Your age is : " + age );
    
//     }

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter Your Age : ");
    int age = input.nextInt();

    while(age < 10 || age > 100){
        System.out.print("Please enter Your age : ");
        age = input.nextInt();
    }
    System.out.println("Your age is : " + age );
}
}
