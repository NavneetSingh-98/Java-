package CollectionAndGenrics.List;


import java.util.Arrays;
import java.util.List;

public class SunOfList {

   //Sum of numbers in list 
    public static void main(String[] args) {
     List<Integer> list =  Arrays.asList(10,20,30,40,50);

     int sum =0;
     for(int num : list){
        sum += num;
     }
     System.out.println(
        "sum =" + sum
     );
    }

}
