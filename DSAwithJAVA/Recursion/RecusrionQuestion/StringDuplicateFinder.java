package DSAwithJAVA.Recursion.RecusrionQuestion;

import java.util.Scanner;

public class StringDuplicateFinder {
    public static void main(String[] args) {
        // String str = "aaabbbbcccccsssssddddrrr";
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your String : ");
        String str = input.next();
        duplicateStringFinder(str, 0, " ");

    }
    public static boolean[] map = new boolean[26];
    public static void duplicateStringFinder(String str, int idx, String newString){

        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar -'a']){
            duplicateStringFinder(str, idx+1, newString);

        }else{
            newString += currChar;
            map[currChar -'a'] = true;
            duplicateStringFinder(str, idx+1, newString);
        }
    }

}
