import java.util.Scanner;

public class GreatestThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome in the Greatest Number Finder");

        System.out.print("Enter Your First Number:   ");
        int num1 = input.nextInt();

        System.out.print("Enter Your Second Number : ");
        int num2 = input.nextInt();

        System.out.print("Enter Your Third Number : ");
        int num3 = input.nextInt();

       if(num1 >= num2 && num1 >= num3){
        System.out.println("Your Num1 is Greatest ");
       }else if(num2 >= num1 && num2 >= num3){
        System.out.println("Your Num2 is greatest ");
       }else if (num3 >= num1 && num3 >= num2){
        System.out.println("Your Num3 is Greatest ");
       }
            
        

        
    }

}
