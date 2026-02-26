package OOPS.AbstractionAndPolymorphism.Polymorphism.Refrences;

public class Car extends Vehicle{

    Car(){
        super();
        
    }
    public int noOfDoor(){
        return 5;
    }

    @Override
    public void start() {
        super.getNoOfTire();
      System.out.println("Car is Starting .. ");
    }
    

    
}
