package CollectionAndGenrics.Challenges;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Challenge91 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,5,4,3,4,3);
        System.out.println(Collections.frequency(list,1));
        System.out.println(Collections.frequency(list,2));
        System.out.println(Collections.frequency(list,3));


        
    }
   
}
