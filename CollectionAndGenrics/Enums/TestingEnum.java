package CollectionAndGenrics.Enums;

public class TestingEnum {

    public static void main(String[] args) {
        
        TrafficLight color = TrafficLight.RED;

        color = TrafficLight.GREEN;

        color = TrafficLight.YELLOW;
        for (TrafficLight values : color.values()) {
            System.out.println(values);
            
        }

    }
    

}
