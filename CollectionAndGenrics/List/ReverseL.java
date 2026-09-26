package CollectionAndGenrics.List;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.Collections;
import java.util.List;

public class ReverseL {

    //Reverse List 
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40,50));

        Collections.reverse(list);
        System.out.println(list);
        

    
}

}
