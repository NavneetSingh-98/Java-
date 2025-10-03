package ExceptionAndFileHandling.TryCatch;

import java.util.Scanner;

public class Calculater {
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your First Number : ");
        int first = input.nextInt();

        System.out.print("Enter Your Second Number : ");
        int second = input.nextInt();

        try{
               int result = first / second;
               System.out.printf("Your result is %d ", result);

        }catch(ArithmeticException e){
              System.out.printf(" %s enter valid value",e.getMessage());

        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.printf("%s enter valid value",ex.getMessage());

        }catch(Throwable th){
            System.out.println("Genreal Exception "); 
            throw th; 
        }
     
    }

}
