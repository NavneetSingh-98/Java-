package FunctionalAndProgramming.FilterAndReduce.Filter;

import java.util.List;

public class TestingFilter {
    public static void main(String[] args) {
        List<String> fruit = List.of("Apple","Banana","Papaya","Mango");
        System.out.println(fruit.size());


        // for (String fruits : fruit) {
        //     System.out.println(fruit);
            
        // }
        System.out.println("Printing Fruits with Streams");
        fruit.stream()
              .filter(fruits -> fruits.endsWith("a"))
              .forEach(fruits -> System.out.println(fruits));
    }

}
