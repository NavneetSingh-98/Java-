package FunctionalAndProgramming.Challenges.Challenge111;

import java.util.stream.IntStream;

public class TestingFactorial{
    public static void main(String[] args) {
      System.out.println("Factorial Using Two Ways ");
      int number = 9;
      System.out.println(facto(6));
        
      

    //   IntStream.range(2, number);
    //             .reduce((a,b) -> a*b)
    //            .ifPresent(System.out::println);
                
               
    }
    
    public static long facto(int num){
        if(num ==0 || num ==1){
            return 1;
        }

        long fact = 1;
        for(int i = 2; i< num ; i++){
            fact = fact * i;

        }
        return fact;
    }

}
