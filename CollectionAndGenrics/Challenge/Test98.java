package CollectionAndGenrics.Challenge;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test98 {
    public static void main(String[] args) {
        //Test Map 
        Map<String , String  > map = new HashMap<>();
        map.put("India", "New Delhi ");
        map.put("China", "Bijing");
        map.put("Russia", "Moscow");
        map.put("Bhutan", "Dhaka");
        map.put("Isrial", "Jerusalam");


        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Country:  ");
        String country = input.next();

        if(map.containsKey(country)){
            System.out.printf("Capital of %s is %s ",country, map.get(country));
        }else{
            System.out.println("Enter Valid Country ");
        }
    }

}
