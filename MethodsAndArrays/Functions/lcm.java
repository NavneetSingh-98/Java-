package MethodsAndArrays.Functions;

import java.util.Scanner;

public class lcm {

    //  public static void main(String[] args) {
        
    //     Scanner input = new Scanner(System.in);
    //     System.out.println("Welcome in the lcm Finder ");

    //     System.out.print("Enter Your First Number : ");
    //     int first = input.nextInt();

    //     System.out.print("Enter Your Second Number : ");
    //     int second = input.nextInt();
    //     int lcm = lcmFinder(first, second);
    //     System.out.println("Your lcm is : " + lcm);

    // }
    // public static int lcmFinder(int first, int second){
    //     int i = 1;
    //     while (true) {
    //         int factor = first * i;
    //         if(factor % second == 0){
    //             return factor;
    //         }
    //         i++;
    //     }
      
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter Your first Number : ");
    int first = input.nextInt();

    System.out.println("Enter Your second Number : ");
    int second = input.nextInt();

    int lcm = lcmFind(first, second);
    System.out.println("Your lcm is "+ lcm);

}
public static int lcmFind(int first , int second){
    int i = 1; 
    while(true){
        int factor = first * i;
        if(factor % second == 0){
            return factor;
        }
        i++;
    }
    
}


}
