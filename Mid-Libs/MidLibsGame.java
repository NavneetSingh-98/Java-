import java.util.Scanner;

public  class MidLibsGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;


        System.out.println("Enter an Adjective (description): ");
        adjective1 = input.nextLine();
        System.out.println("Enter a noun (animal or person ) : ");
        noun1 = input.nextLine();
        System.out.println("Enter a adjective  (description) : ");
        adjective2 = input.nextLine();
        System.out.println("Enter a verd end with -ing (action): ");
        verb1 = input.nextLine();
        System.out.println("Enter a adjective (description) : ");
        adjective3 = input.nextLine();

        System.out.println("Today I went to a" + adjective1 + "zoo.");
        System.out.println("In an exhibit I saw a " + noun1 + ".");
        System.out.println(noun1 + "was" + adjective2 + "and" + verb1 + ".");
        System.out.println("I was " + adjective3 + "zoo.");
        System.out.println("Today I went to a" + adjective1 + "!");

    }

    
}