package CollectionAndGenrics.Challenge.Challenge96;

public class Main {
    public static void main(String[] args) {
        for(Day day : Day.values()){
        System.out.println(day);
        }
        
    }
    enum Day{
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THRUSDAY,
        FRIDAY,
        SATURDAY
    }

}
