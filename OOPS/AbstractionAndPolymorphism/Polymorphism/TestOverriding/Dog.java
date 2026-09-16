package OOPS.AbstractionAndPolymorphism.Polymorphism.TestOverriding;

public class Dog extends Animals{

    @Override
    public void sound() {
        System.out.println("Bhoo Bhoo ");
    }

    @Override
    public void run() {
       System.out.println("Yes I can Run Very fast ...");
    }

    @Override
    public void fly() {
   System.out.println("No I can not fly ");
    }

}
