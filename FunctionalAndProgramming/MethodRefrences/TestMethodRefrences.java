package FunctionalAndProgramming.MethodRefrences;

import java.util.List;

public class TestMethodRefrences {
    public static void main(String[] args) {
        
        List<Integer> number = List.of(1,2,3,2,5,4,3,7,5);

        // Without Method Refrences 

        // number.stream()
        //   .filter(num -> num % 2 == 1)
        //   .forEach(num -> System.out.println(num));

        // With Method Refrences 

        number.stream()
           .filter(num -> num % 2 == 1)
           .forEach(System.out::println);
    }

}
