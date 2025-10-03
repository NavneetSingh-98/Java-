package FunctionalAndProgramming.Challlenges.Challenge113;

import java.util.List;
import java.util.stream.Collectors;

public class DistinctNumber {
    public static void main(String[] args) {
        List<Integer> number = List.of(1,2,3,4,5,6,78,9,7,6,5,4,3);
        List<Integer> NewNumber = number.stream()
                                         .distinct()
                                         .collect(Collectors.toList());
                                         System.out.println(number);
                                         System.out.println(NewNumber);
    }

}
