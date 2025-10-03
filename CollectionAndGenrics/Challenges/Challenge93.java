package CollectionAndGenrics.Challenges;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Challenge93 {
    public static void main(String[] args) {
        
        // Reverse List 

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println(list);
        reverse(list);
        System.out.println(list);

        
    }
    public static void reverse(List<Integer> list){
        Collections.reverse(list);
    }


}
