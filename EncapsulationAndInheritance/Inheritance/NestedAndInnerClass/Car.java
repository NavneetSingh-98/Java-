package EncapsulationAndInheritance.Inheritance.NestedAndInnerClass;

public class Car {

    private int noOdDoors;

    public void repair(){
        Tire t = new Tire();

    }
    protected static class Tire{
        private double width;
        private double pressure;
        private String material;


    }

}
