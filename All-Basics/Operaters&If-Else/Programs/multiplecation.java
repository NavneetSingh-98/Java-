import java.util.Scanner;

public class multiplecation {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Welcome in the Floating Multiplecation !");

    System.out.print("Enter Your First Number : ");
    float first = input.nextFloat();

    System.out.print("Enter Your Second Number : ");
    float  second = input.nextFloat();

    float result =  (first * second);
    System.out.println("Your result is : " + result);
}
}
