package FunctionalAndProgramming.Optional;

import java.util.List;
import java.util.Optional;

public class TestingOptional {
    public static void main(String[] args) {
        
        List<Integer> number = List.of(1,2,3,4,5,6,7,5,6,7);
        Optional<Integer> newSum = number.stream()
                                         .reduce((a,b) -> a+b);
                                         if(newSum.isPresent()){
                                            System.out.println(newSum.get());
                                         }else{
                                            System.out.println("List is empty");
                                         }
                                      
    }

}
