package FunctionalAndProgramming.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class MiniN {
    public static void main(String[] args) {

// For Minimum Number 
        // List<Integer> num = Arrays.asList(0,34,25,67,78,45,67);
        // num.stream()
        // .filter(n -> n< 60)
        // .forEach(System.out :: println);


//String to Upper Case 


        // List<String> str = Arrays.asList("java", "springboot", "mongoDb","sql","kafka");

        // str.stream()
        // .map(String::toUpperCase)
        // .forEach(System.out::println);


        // Remove Duplicate 

        List<Integer> num = Arrays.asList(2,2,33,33,4,4,5,6,7,86);
        num.stream()
        .distinct()
        .forEach(System.out::println);
    }

}
