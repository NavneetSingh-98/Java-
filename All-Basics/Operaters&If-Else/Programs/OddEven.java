import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);

        // System.out.println("Welcome in the Odd Even Number Finder ");

        // System.out.print("Enter Your Number : ");
        // int num = input.nextInt();

        // if(num %2 ==0){
        //     System.out.println("Your Number is Even ");
        // }else{
        //     System.out.println("Your Number is Odd");
        // }

        Scanner input =  new Scanner(System.in);
        System.out.println("Enter Your Number : ");
        int num = input.nextInt();

        if(num%2==0){
            System.out.println("Number is Even ");
        }else{
            System.out.println("Number is Odd");
        }
    }

}
