package OOPS.AbstractionAndPolymorphism.Abstraction.AbstractionTest;

public class Car extends Vehicle{

    private int noOfDoors;

    public Car() {
        super(4);

    }
    @Override
    public void makeStartSound() {
    System.out.println("brommmmmm...");
        
    }
    @Override
    public void getSetGo() {
      
      System.out.println("....going...");
    }

}
