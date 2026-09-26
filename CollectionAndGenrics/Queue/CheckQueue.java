
package CollectionAndGenrics.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class CheckQueue {
    public static void main(String[] args) {
        //Create a queue and add element s

        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        System.out.println("Removed " + queue.remove());  //Remove Element
        System.out.println(queue); //Print queue 

        System.out.println(queue.peek()); // See the first element  peek() -> return first element 
        System.out.println(queue.poll()); // remove first element  poll() -> return and remove first element 

        if(!queue.isEmpty()){
            System.out.println("Queue is not empty ");
        }

        System.out.println(queue.size());  //Size of queue 

        //Iterate through Queue 

        for(Integer num : queue){
            System.out.println(num);
        }

    }

}
