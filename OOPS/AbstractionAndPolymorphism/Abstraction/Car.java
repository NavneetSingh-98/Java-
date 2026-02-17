package OOPS.AbstractionAndPolymorphism.Abstraction;

public class Car extends Vehicle{

  private int noOfDoors;
   public Car(){
     super(4);
   }

   @Override
   public void makeStartSound() {
   System.out.println("Vrooommm .. Vrooooommmmm");
   }

   @Override
   public void getSetGo() {
   System.out.println("I am Going ");
   }
    

}
