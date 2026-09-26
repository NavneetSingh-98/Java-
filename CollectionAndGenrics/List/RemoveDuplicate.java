package CollectionAndGenrics.List;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicate {
    //Remove duplicat from list 
    public static void main(String[] args) {
        
    
    List<Integer> list = Arrays.asList(2,2,3,2,3,2,3,2,3,2,310,20);
    List<Integer> unique = new ArrayList<>();

    for(int num : list){
        if(!unique.contains(num)){
            unique.add(num);
        }
    }
    System.out.println(unique);
    
}
}

