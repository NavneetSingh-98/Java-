package FunctionalAndProgramming.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class MaxN {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,2,3,4,5,69,6660,888958585);

        num.stream()
        .filter(n -> n > 50)
        .forEach(System.out ::println);

    }

}
