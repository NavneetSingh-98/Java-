package FunctionalAndProgramming.Challlenges.Challenge113;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestingDistinct {
    public static void main(String[] args) {
        
        List<Integer> number =List.of(1,2,3,4,5,6,5,4,3,2,3,4,56,4,3);
      List<Integer>  NewNumbers=  number.stream()
              .distinct()
              .collect(Collectors.toList());
              System.out.println(number);
              System.out.println(NewNumbers);
    }

}
