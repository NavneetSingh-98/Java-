package CollectionAndGenrics.Enums.TrafficLight;

public class Main {
    public static void main(String[] args) {
        for(Color color : Color.values()){
            System.out.println(color);
        }
        
    }
    enum Color{
        RED,
        GREEN,
        YELLOW
    }

}
