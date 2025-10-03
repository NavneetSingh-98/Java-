package DSAwithJAVA.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class TestArrayList {

    //ArraryList 
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //add
        list.add(0);
        list.add(2);
        list.add(5);
        System.out.println(list);

        //get
        int element = list.get(0);
        System.out.println(element);

        //add element in between 
        list.add(1, 1);
        System.out.println(list);

        // set Element 
        list.set(0, 5);
        System.out.println(list);

        //remove element 
        list.remove(2);
        System.out.println(list);

        //list size 
        int size = list.size();
        System.out.println(size);

        //loops
        for(int i= 0 ; i<list.size(); i++){
            System.out.print(list.get(i));
        }
        System.out.println();

        //sorting 
        Collections.sort(list);
        System.out.println(list);
    }

}
