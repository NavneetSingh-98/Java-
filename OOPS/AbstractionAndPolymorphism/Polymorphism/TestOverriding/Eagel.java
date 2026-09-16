package OOPS.AbstractionAndPolymorphism.Polymorphism.TestOverriding;

public class Eagel extends Animals{

    @Override
    public void sound() {
      System.out.println("Creppy Sound ");
    }

    @Override
    public void run() {
       System.out.println(" NO I can not run");
    }

    @Override
    public void fly() {
       System.out.println("Yes I can fly ");
    }

}
