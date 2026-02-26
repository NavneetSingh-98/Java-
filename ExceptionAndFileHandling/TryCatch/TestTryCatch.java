package ExceptionAndFileHandling.TryCatch;

import java.util.Scanner;

public class TestTryCatch {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("\n Enter Your First Number : ");
        int first = input.nextInt();

        System.out.println("Enter Your Second Number : ");
        int second = input.nextInt();

        try{
            int result = first/ second;
            System.out.printf("your result is %d ",result);
        }catch(ArithmeticException e){
            System.out.printf("%s enter valid number ",e.getMessage());

        }finally{
            System.out.println("I am always Run ...! Because i am Finnaly ");
        }
    }

}
