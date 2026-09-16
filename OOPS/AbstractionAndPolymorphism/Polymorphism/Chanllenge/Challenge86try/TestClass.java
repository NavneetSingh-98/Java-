package OOPS.AbstractionAndPolymorphism.Polymorphism.Chanllenge.Challenge86try;

public class TestClass {
    public static void main(String[] args) {
        Bike b1 = new Bike();
        Car c1 = new Car();

        b1.service();
        b1.makeStartSound();
        b1.drive();

        c1.service();
        c1.makeStartSound();
        c1.drive();
    }

}
