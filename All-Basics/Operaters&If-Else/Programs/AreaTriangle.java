import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome in the Triangle area Finder Program ");

        System.out.print("Enter Your Base : ");
        int base = input.nextInt();

        System.out.println("Enter Your Height : ");
        int height = input.nextInt();

        int area = (int) (0.5 * ( base * height));

        System.out.println("Your area is : " + area);
  

    }

}
