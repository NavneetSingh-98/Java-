package CollectionAndGenrics.Challenges;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Example90 {
    public static void main(String[] args) {
        
        List<String>  list = Arrays.asList("Lion","Bear","Fox","Cow");
        sortInDescanding(list);
        System.out.println(list);
    }
    public static void sortInDescanding(List<String> stringList){
        Collections.sort(stringList);
    }

}
