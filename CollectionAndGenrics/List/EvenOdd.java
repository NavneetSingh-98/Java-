package CollectionAndGenrics.List;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class EvenOdd {

    // Find Odd Even numbers In Lists
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,5,3,1,7,8,5,9,90);
        
        for(int num : list){
            if(num %2 ==0){
                System.out.println(num + "is even");
    }else{
        System.out.println(num+ "is odd");
    }
}
    }

}
