package ExceptionAndFileHandling.Finally;

import java.util.Scanner;

public class CheckFinally {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter Your First Number :");
        int first = input.nextInt();

        System.out.printf("Enter Your Second Number : ");
        int second = input.nextInt();

        try{
             int result = first / second;
        System.out.printf("Result is %s  " ,result);

        }catch(ArithmeticException e){
            System.out.printf("%s by Zero exception",e.getMessage());
        }finally{
            System.out.println("I am Finally");
            System.out.println("Yes I am Finally");
        }
       
    }

}
