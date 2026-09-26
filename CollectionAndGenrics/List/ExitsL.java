package CollectionAndGenrics.List;

import java.util.Arrays;
import java.util.List;

public class ExitsL {
    public static void main(String[] args) {
        //Check Element exit or not 

        List<Integer> list = Arrays.asList(10,20,30,40);
        if(list.contains(30)){
            System.out.println("Element exits");
        }else{
            System.out.println("Element not exits");
        }
    }

}
