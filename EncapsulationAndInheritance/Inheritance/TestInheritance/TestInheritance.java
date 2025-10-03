package EncapsulationAndInheritance.Inheritance.TestInheritance;

public class TestInheritance {
    public static void main(String[] args) {
        
        Vehicle vehicle = new Vehicle();
        TwoWheeler twoWheeler = new TwoWheeler();
        MoterCycle moterCycle = new MoterCycle();

        vehicle.commute();
        twoWheeler.commute();
        moterCycle.commute();
        moterCycle.balance();

        System.out.println(vehicle.hashCode());
        System.out.println(vehicle.toString());
        System.out.println(vehicle.getClass());

        System.out.println(moterCycle.hashCode());
        System.out.println(moterCycle.toString());
        System.out.println(moterCycle.getClass());

        System.out.println(twoWheeler.hashCode());
        System.out.println(twoWheeler.toString());
        System.out.println(twoWheeler.getClass());
    }

}
