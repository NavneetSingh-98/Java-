package OOPS.AbstractionAndPolymorphism.Abstraction.Interface;

public class Dog implements Animals{

    @Override
    public void run() {
       System.out.println("I am Animal So i can Run ");
    }

    @Override
    public void sleep() {
      System.out.println("I am animal so i can sleep ");
    }

}
