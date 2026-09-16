package OOPS.AbstractionAndPolymorphism.Polymorphism.Chanllenge.Challenge86try;

public class Car extends Vechicle{

    @Override
    public void service() {
      System.out.println("Car is getting service .......");
    }

    @Override
    public void makeStartSound() {
       System.out.println("Car make sound when its start ..... bhurhaaaaaa");

    
}

    @Override
    public void drive() {
        System.out.println("Car is driving ");
    }

}
