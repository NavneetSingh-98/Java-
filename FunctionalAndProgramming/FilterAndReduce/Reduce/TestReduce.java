package FunctionalAndProgramming.FilterAndReduce.Reduce;

import java.util.List;

public class TestReduce {
    public static void main(String[] args) {
        
        List<Integer> number = List.of(1,2,3,4,5,4,3,5,6,7,8,6);

        // int sum = 0;
        // for (Integer number2 : number) {
        //     sum += number2;
            
        // }
        // System.out.println(sum);

        int newSum =  number.stream()
        // System.out.printf("Sum using reduce is 5% : ",number);
              .reduce(0,(a,b) -> a + b);
              System.out.printf("Sum using reduce is : %d  ",newSum);

              int max = number.stream()
                              .reduce(Integer.MIN_VALUE, (a,b) -> a > b ? a : b);
                              System.out.printf("Max value using reduce is : %d ",max);


                                int min = number.stream()
                                                .reduce(Integer.MAX_VALUE, (a,b) -> a < b ? a : b);
                                                System.out.printf("Min value is using reduce is : %d ",min);
    }

}
