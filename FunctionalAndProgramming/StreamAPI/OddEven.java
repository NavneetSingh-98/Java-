package FunctionalAndProgramming.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class OddEven {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(10,20,30,40,50,15,19,45,67);

        num.stream()
        .filter(n -> n% 2==0)
        .forEach(System.out::println);
    
}

}
