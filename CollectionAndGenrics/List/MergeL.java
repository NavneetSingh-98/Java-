package CollectionAndGenrics.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeL {
    public static void main(String[] args) {
        //Merge two Lists 
        List<Integer> list1 = Arrays.asList(5,15,25,35,45);

        List<Integer> list2 = Arrays.asList(10,20,30,40,50);

        List<Integer> merged = new ArrayList<>(list1);

        merged.addAll(list2);
        System.out.println(merged);
    }

}
