package FunctionalAndProgramming.Optional;

import java.util.List;
import java.util.Optional;

public class Test {
    public static void main(String[] args) {
        List<Integer> number = List.of();

    Optional<Integer>  newSum = number.stream()
          .reduce((a,b) -> a+b);

          if(newSum.isPresent()){
            System.out.println(newSum.get());
          }else{
            System.out.println("List is empty ");
          }
        
    }

}
