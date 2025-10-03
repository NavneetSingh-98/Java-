package CollectionAndGenrics.Challenge.Challenge96;

import java.util.Scanner;

public class TestingDay {
    public static void main(String[] args) {

        System.out.println(Day.MONDAY);
        System.out.println(Day.TUESDAY);
        System.out.println(Day.WEDNESDAY);
        System.out.println(Day.THRUSDAY);
        System.out.println(Day.FRIDAY);
        System.out.println(Day.SATURDAY);
        System.out.println(Day.SUNDAY);

        // for (Day values : Day.values()) {
        //     System.out.println(values);
            
        // }

        for(Day values  : Day.values()){
            System.out.println(values);
        }
    
    }
}
