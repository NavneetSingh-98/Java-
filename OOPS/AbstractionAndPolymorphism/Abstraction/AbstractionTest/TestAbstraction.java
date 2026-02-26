package OOPS.AbstractionAndPolymorphism.Abstraction.AbstractionTest;

public class TestAbstraction {
    public static void main(String[] args) {
        // Vehicle vehicle = new Vehicle(2); 
        // abstract meam no anyone make its Object 
        Car car = new Car();
        car.commute();
        car.makeStartSound();
        car.getSetGo();
        System.out.println(car);
    }

}
