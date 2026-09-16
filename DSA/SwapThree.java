import java.util.Scanner;

public class SwapThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your First Number : ");
        int first = input.nextInt();

        System.out.println("Enter Your Second Number : ");
        int second = input.nextInt();

        int three = second;
        second = first;
        first = three;
        System.out.println("After Swapping Number First  : " + first);
        System.out.println("After Swapping Number  Second : " + second);
    }
    
}
