package CollectionAndGenrics.Challenges;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Challenge90 {
    public static void main(String[] args) {

        // Compararter

        List<String> list = Arrays.asList("Lion","Bear","Ant");
        sortInDescending(list);
        System.out.println(list);
        
       
    }
    public static void sortInDescending(List<String> stringList){
        Collections.sort(stringList);
        
    }

}
