package CollectionAndGenrics.List;

import java.util.ArrayList;
import java.util.List;

public class Add {
    public static void main(String[] args) {
        
        List<String> strList = new ArrayList<>();
        List<Integer > intList = new ArrayList<>(6);

        strList.add("Navneet");
        strList.add("Rajput");
        intList.add(5);
        intList.remove(0);

        strList.add(1,"Rajkumar ");
        strList.add(2,"Singh");
  
        System.out.println(strList);
        System.out.println(intList);

        if(strList.contains("Rajput")){
            System.out.println("Exists Rajput ");
        }

    }

}
