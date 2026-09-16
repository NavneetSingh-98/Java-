package OOPS.AbstractionAndPolymorphism.Polymorphism.Chanllenge.Challenge86try;

public class Bike extends Vechicle{

    @Override
    public void service() {
      System.out.println("Bike is getting service....");
    }

    @Override
    public void drive() {
       System.out.println("Bike is Driving....");
    }

    @Override
    public void makeStartSound() {
        System.out.println("Bike make sound when its start ..... vrooommmmmm");
    }

}
