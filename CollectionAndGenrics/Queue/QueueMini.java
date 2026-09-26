package CollectionAndGenrics.Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class QueueMini {
    public static void main(String[] args) {
        //Minimum element in Queue 
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(12,34,56,34,67,1,68));

        int min = Integer.MAX_VALUE;

        for(int num : queue){
            if(min > num){
                min = num;
            }
        }
        System.out.println("Minimum "+ min);
    }

}
