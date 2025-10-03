package ExceptionAndFileHandling.Challenge87;

import java.util.Scanner;

public class Handling {
    public static void main(String[] args) {
        
            Scanner input = new Scanner(System.in);

            System.out.print("Enter Your First Number : ");
            int num1 = input.nextInt();

            System.out.print("Enter Your Second Number : ");
            int num2 = input.nextInt();

            try{

                int result  = num1 /num2;

                System.out.printf("Your result is %s : ", result);
            }catch(ArithmeticException e){
                System.out.printf(" %s enter Valid Number  ",e.getMessage());
            }
                
            }

}
