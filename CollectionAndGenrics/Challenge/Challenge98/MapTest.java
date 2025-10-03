package CollectionAndGenrics.Challenge.Challenge98;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapTest {
    public static void main(String[] args) {
        
        Map<String , String > map = new HashMap<>();

        map.put("India", "New Delhi");
        map.put("Russia ", "Moscow");
        map.put("U.S.A", "WasingTon Dc");
        map.put("Mayamar", "NayipaiTao");
        map.put("France", "Paris");


        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Country Name : ");
        String country = input.next();

        if(map.containsKey(country)){
            System.out.printf("Capital of %s is %s ",country,map.get(country));

        }else{
            System.out.println("Sorry Country does not exixts !");
        }
    }

}
