package CollectionAndGenrics.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDuplicate {

    //Fimmd duplicates in List 
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4,5,6,2,2,2,3,7,8,9);

        List<Integer> duplicate = new ArrayList<>();

        for(int num : list){
           if(list.indexOf(num) != list.lastIndexOf(num)
        &&!
    duplicate.contains(num)){
        duplicate.add(num);
    }
        

        }
        System.out.println(duplicate);
    }

}
