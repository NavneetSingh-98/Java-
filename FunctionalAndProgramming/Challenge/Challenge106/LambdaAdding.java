package FunctionalAndProgramming.Challenge.Challenge106;

import java.util.function.BinaryOperator;

public class LambdaAdding {
    public static void main(String[] args) {
        BinaryOperator<Integer> add = (a,b) -> a+ b;
      int result =  add.apply(5, 5);
        System.out.println(result);
    }

}
