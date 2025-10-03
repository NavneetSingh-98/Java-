package FunctionalAndProgramming.Challenge.Challenge106;

import java.util.function.BinaryOperator;

public class LambdaDivide {
    public static void main(String[] args) {
        BinaryOperator<Integer> div = (a, b) -> a % b;
        int result = div.apply(10, 5);
        System.out.println(result);
    }

}
