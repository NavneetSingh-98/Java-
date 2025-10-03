package FunctionalAndProgramming.Challenge.Challenge108;

import java.util.List;

public class FilterStrings {
    public static void main(String[] args) {
        List<String> strs = List.of(" Navneet","This java course is the best Course ","I want to be become a java Devloper","I am Intrested to devlop app in java programing languages ");

      String result =   strs.stream()
           .filter(str -> str.length() > 10)
           .reduce("",(a,b) -> a+ " " +b );
           System.out.println(result);
          
    }

}
