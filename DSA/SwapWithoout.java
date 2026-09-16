import java.util.Scanner;

public class SwapWithoout {
    public static void main(String[] args) {
        // Swapping without Third variable 
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your First Number : ");
        int first = input.nextInt();

        System.out.println("Enter Your Second Number : ");
        int second = input.nextInt();

         first = first +  second;
         second = first - second;
         first = first - second;

         System.out.println("Your Swap First value is : " + first );
         System.out.println("Your Swap Second value is : " + second );
        
    }

}
