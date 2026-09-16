package OOPS.AbstractionAndPolymorphism.Polymorphism.TestOverriding;

public class Duck extends Animals{

    @Override
    public void sound() {
       System.out.println("Quack Quack");
    }

    @Override
    public void run() {
      System.out.println("Yes I can Run ");
    }

    @Override
    public void fly() {
       System.out.println("Yes I can fly");
    }

}
