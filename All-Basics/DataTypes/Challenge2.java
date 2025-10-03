import java.util.Scanner;

public class Challenge2 {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter Your Name : ");
    String name = input.next();

    System.out.print("Enter Your age : ");
    int age = input.nextInt();

    System.out.print(name + " your age is " + age +  "\n Now tell me your Birth Date :");
    int birth= input.nextInt();

    System.out.println("Thankyou For Giving me Details ");

 }

}
