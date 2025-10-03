package DSAwithJAVA.HashMap;

import java.util.HashMap;

public class Hashing {
    public static void main(String[] args) {

        //Country (key) - Country capital
        HashMap<String, Integer> map = new HashMap<>();

        //Insert
        map.put("India", 120);
        map.put("Sri Lanka ", 50);
        map.put("Bhutan",40);
        map.put("Isrial", 38);

        System.out.println(map);
        System.out.println( map.size()); 

        //search

        if(map.containsKey("India")){

            System.out.println("key is the preset in map ");
        }else{
            System.out.println("key in not preset in the map ");
        }


        System.out.println(map.get("India"));
        System.out.println(map.get("Bharat"));

    }

}
