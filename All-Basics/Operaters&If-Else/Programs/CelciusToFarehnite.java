import java.util.Scanner;

public class CelciusToFarehnite {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Temparture ");

        System.out.println("Entre your temp in F : ");
        float fah = input.nextFloat();

        float cel = ( fah -32) * 5/9;
        System.out.println("Your temp is:  "+ cel);
    }
    
}
