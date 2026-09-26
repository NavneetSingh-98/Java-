package CollectionAndGenrics.Set;

import java.util.HashSet;
import java.util.Set;

public class AddS {
public static void main(String[] args) {
    //Add elements in Set 
    Set<Integer> set = new HashSet<>();
    set.add(10);
    set.add(30);
    set.add(40);
    set.add(50);
    System.out.println(set);
    System.out.println( "size :  " + set.size());
    System.out.println(set.contains(10));
}
}
