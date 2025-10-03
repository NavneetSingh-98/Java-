package CollectionAndGenrics.Set;

import java.util.HashSet;
import java.util.Set;

import CollectionAndGenrics.Utility;
import java.util.List;

public class TestingSet {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();

        System.out.println(names.add("Navneet"));
        System.out.println(names.add("Rajput"));
    
        System.out.println(names.add("Yash"));
        System.out.println(names.add("Kumar"));

        Utility.print(names);
        System.out.println(names.add("Navneet"));
        System.out.println(names.size());
    }

}
