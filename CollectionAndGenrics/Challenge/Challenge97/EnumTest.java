package CollectionAndGenrics.Challenge.Challenge97;

public class EnumTest {
public static void main(String[] args) {
    
    System.out.println("Priniting all the days of week ");

    for (Day values : Day.values()) {
        System.out.printf("%s : %s \n",values, values.getType());
        
    }
}
}
