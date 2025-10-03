package CollectionAndGenrics.Challenges;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Challenge95 {
// Take String and return Number 

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    Set<Character> unique = new HashSet<>();

    System.out.print("Please Enter Your String : ");
    String userStr = input.next();

    for(char  ch : userStr.toCharArray()){
        unique.add(ch);
    }
    System.out.printf("Your String has %d unique charecters ",unique.size());
}
}
