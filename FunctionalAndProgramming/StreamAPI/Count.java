package FunctionalAndProgramming.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Count {
    public static void main(String[] args) {
        // List<Integer> num = Arrays.asList(2,3,4,6,7,8,9,10);

        // long count = num.stream()
        // .filter(n -> n> 5)
        // .count();

        // System.out.println(count);

//Find First Name 
        // List<String> str = Arrays.asList("Navneet", "Shivam", "Manju");

        // String first = str.stream()
        // .findFirst()
        // .get();

        // System.out.println(first);


        //Convert List 

        // List<Integer> num = Arrays.asList(1,2,3,4,5);

        // List<Integer> square = num.stream()
        // .map(n -> n*n)
        // .toList();
        // System.out.println(square);


        //Convert List 

        List<Integer> num = Arrays.asList(1,2,3,4,5);

        List<Integer> cube = num.stream()
        .map(n -> n*(n-1))
        .toList();

        System.out.println(cube);

    }

}
