package FunctionalAndProgramming.Challenge.Challenge106;

import java.util.function.BinaryOperator;

public class LambdaSubs {
    public static void main(String[] args) {
        BinaryOperator<Integer> subs = (a,b) -> a-b;
        int result = subs.apply(10, 5);
        System.out.println(result);
        }

}
