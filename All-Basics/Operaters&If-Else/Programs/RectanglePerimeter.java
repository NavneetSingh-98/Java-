import java.util.Scanner;

public class RectanglePerimeter {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        
        System.out.println("Welcome in the Rectangle Perimeter ");

        System.out.print("Enter Your A side :");
        int a = input.nextInt();

        System.out.print("Enter Your B side : ");
        int b = input.nextInt();

        System.out.print("Enter Your C side : ");
        int c = input.nextInt();

        System.out.print("Enter Your D side : ");
        int d = input.nextInt();

        int rectangle = a + b + c + d;

        System.out.println("Your perimeter is : " + rectangle);
    }

}
