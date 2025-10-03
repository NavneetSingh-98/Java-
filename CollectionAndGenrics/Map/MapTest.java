package CollectionAndGenrics.Map;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {

        System.out.println("Welcome in the Map Testing ");

        Map<String , Integer> queeu = new HashMap<>();

      queeu.put("Navneet", 001);
      queeu.put("Shivam", 002);
      queeu.put("Names ", 003);

      System.out.println(queeu.size());
      System.out.println(queeu.get("Navneet"));
      
    }
}
