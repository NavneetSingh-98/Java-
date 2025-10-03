package AbstractionAndPolymorphism.Abstraction;

public class TestAbstraction {
    public static void main(String[] args) {
        
        // Vehicle veh = new Vehicle(4);
        Car car = new Car();
        car.commute();
        car.makeStartSound();
        car.getSetGo();
    }

}
