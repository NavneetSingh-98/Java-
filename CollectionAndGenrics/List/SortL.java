package CollectionAndGenrics.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortL {
    public static void main(String[] args) {
        //Sort list 

        List<Integer> list = new ArrayList<>(Arrays.asList(30,50,27,22,44,12,1));

        Collections.sort(list);
        System.out.println(list);
    }

}
