package OOPS.EncapsulationAndInheritance.GettersSetters;

public class GettersTest {
    public static void main(String[] args) {
        
        Car car = new Car("Yellow", "Swift", 10, 1000);

        System.out.printf("%s %s",car.getColor() , car.getModel());
    }
}
