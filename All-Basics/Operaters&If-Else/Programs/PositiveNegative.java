import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome in the Positive , Negative Or Zero Finder ");

        System.out.print("Enter Your Number : ");
        int num = input.nextInt();

        if(num == 0){
            System.out.println("Your Number is equals to Zero ");
        }else if(num >= 0){
            System.out.println("Your Number is Positive ");
        }else if(num <= 0){
            System.out.println("Your Number is Negative ");
        }
    }

}
