package ExceptionAndFileHandling.TryCatch;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your First Number : ");
        int first = input.nextInt();

        System.out.println("Enter Your Second Number : ");
        int second = input.nextInt();

        try{
             int result = first / second;
             System.out.printf("Your result is : ", result);
        }catch(ArithmeticException e){
            System.out.printf("%s Enter Valid Value : ",e.getMessage());
        }
       

    }

}
