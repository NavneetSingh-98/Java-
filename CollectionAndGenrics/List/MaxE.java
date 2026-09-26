package CollectionAndGenrics.List;

import java.util.Arrays;
import java.util.List;

public class MaxE {
    //Find Max Element iN List 
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(10,20,30,40,50,100);

        int max = list.get(0);

        for(int num : list){
            if(num > max){
                max= num;
            }
        }
        System.out.println("Your max : " + max);

    }

}
