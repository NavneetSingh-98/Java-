package DSAwithJAVA.HashSet;
import java.util.HashSet;

public class Hashing {
    public static void main(String[] args) {

        //HashSet
        HashSet<Integer> set = new HashSet<>();

        //Insert 
        set.add(4);
        set.add(5);
        set.add(7);
        set.add(5);

        //search - contains
        if(set.contains(5)){
            System.out.println("Set is exists");
        }
        if(!set.contains(2)){
            System.out.println("not exixts");
        }

        //delete 
        set.remove(4);

        System.out.println(set.size());

        set.remove(7);

        System.out.println( "size of set is : "+ set.size());

        set.remove(5);
        System.out.println(set.size());
        
    }

}
