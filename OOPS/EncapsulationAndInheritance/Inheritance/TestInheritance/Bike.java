package OOPS.EncapsulationAndInheritance.Inheritance.TestInheritance;

public class Bike extends Vehicle{

    Bike(){
        noOfTyre  = 2;
        maxSpeed = 190;

    }
    public void horn(){
    System.out.println("I am Vehicle so i have a Good Horn");
    }
    
}
