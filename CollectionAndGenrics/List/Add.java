package CollectionAndGenrics.List;

import java.util.ArrayList;
import java.util.List;

public class Add {
    public static void main(String[] args) {
        
        List<String> strList = new ArrayList<>();

        strList.add("Navneet");
        strList.add("Rajput");

        strList.add(1,"Rajkumar ");
        strList.add(2,"Singh");
  
        System.out.println(strList);

        if(strList.contains("Rajput")){
            System.out.println("Exists Rajput ");
        }

    }

}
