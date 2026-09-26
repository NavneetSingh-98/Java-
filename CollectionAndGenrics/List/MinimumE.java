package CollectionAndGenrics.List;

import java.util.Arrays;
import java.util.List;

public class MinimumE {
    //Find Minimum number in list 
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,30,2,48,578);

        int min = list.get(0);

        for(int num : list ){
            if(min > num){
                min = num ;
            }
        }
        System.out.println("Your min : "+ min);
    }

}
