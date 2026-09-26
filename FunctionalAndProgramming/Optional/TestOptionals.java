package FunctionalAndProgramming.Optional;

import java.nio.file.OpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TestOptionals {
    public static void main(String[] args) {
        //Test Optionals

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Optional<Integer> newSum = numbers.stream()
         .reduce((a,b) -> a+ b);
         if(newSum.isPresent()){
            System.out.println(newSum.get());
         }else{
            System.out.println("List is empty");
         }
    }

}
