package CollectionAndGenrics.List;

import java.util.ArrayList;
import java.util.List;

public class TestingAdd {
    public static void main(String[] args) {

        //List Implement ArrayList 
        List<String> strList = new ArrayList<>();

        strList.add("Navneet");
        System.out.println(strList.indexOf(3));

        strList.add("Rajput");
        System.out.println(strList.hashCode());
        strList.add("Greater Noida ");
        strList.add("From");

        if(strList.contains("Rajput")){
            System.out.println("Rajput Exits");

            System.out.println(strList);
        }

        


    }

}
