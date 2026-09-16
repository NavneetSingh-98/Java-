package OOPS.AbstractionAndPolymorphism.Abstraction.TestInterface;

public class Eagel implements Birds{

    @Override
    public void fly() {
        System.out.println("I am Bird So i can Fly ");
        
    }

    @Override
    public void sleep() {
        System.out.println("I am a Bird So i can Sleep");
      
    }

    @Override
    public void clow() {
        System.out.println("I am a Bird So I have two clow");
       
    }

    

}
