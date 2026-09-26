package CollectionAndGenrics.Map;

import java.util.HashMap;
import java.util.Map;

public class CheckM {
    //Create and print a Map 
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(01," Navneet Singh");
         map.put(02," Manju Kumari");
          map.put(03," Rajkumar Singh");
           map.put(04," Shivam Singh");

           //Print map 
           System.out.println(map );

           //Get VALUE 
           System.out.println(map.get(1));

           //Check map contain value or not 

           System.out.println(map.containsKey(1));
           System.out.println(map.containsKey(6));

           //Check map contain value or not 
           System.out.println(map.containsValue(" Navneet Singh"));

    }

}
