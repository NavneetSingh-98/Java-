package CollectionAndGenrics.Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MaxQ {
    public static void main(String[] args) {
        //Find Maximum Queue 

        Queue<Integer> queue = new LinkedList<>(Arrays.asList(10,34,56,35,67,896,34));

        int max = Integer.MIN_VALUE;

        for(int num : queue){
            if(num > max){
                max  = num;
            }
        }
        System.out.println("Maximun "+ max);
    }

}
