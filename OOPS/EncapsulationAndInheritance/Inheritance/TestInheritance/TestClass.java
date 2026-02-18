package OOPS.EncapsulationAndInheritance.Inheritance.TestInheritance;

public class TestClass {
    public static void main(String[] args) {
        Cycle cycle = new Cycle();
        Bus bus = new Bus();
        Bike bike = new Bike();
        Vehicle vehicle = new Vehicle();

        System.out.println(bike.maxSpeed);
        System.out.println(cycle.maxSpeed);
        System.out.println(bus.maxSpeed);
        System.out.println(vehicle.maxSpeed);
        
       cycle.noPolution();
       bus.Passanger();
       bike.horn();
     
    }

}
