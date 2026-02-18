package OOPS.EncapsulationAndInheritance.Inheritance.TestInheritance;

public class Cycle extends Vehicle{

    Cycle(){
        noOfTyre = 2;
        maxSpeed = 20;

    }
    public void noPolution(){
        System.out.println("I have no way to release any type of pollution");
    }
    
}
