package CollectionAndGenrics.Challenges;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Example95 {
    public static void main(String[] args) {
        //Unique Charecters In A String 
        Scanner input = new Scanner(System.in);

        Set<Character> unique  = new HashSet<>();
        System.out.println("Enter Your String : ");
        String unStrs = input.next();

        for(char ch : unStrs.toCharArray()){
            unique.add(ch);
    
        }
        System.out.printf("Your String has %d Unique Charcter: ",unique.size());
    }

}
