package OOPS.AbstractionAndPolymorphism.Challenge84;

public class Eagle extends Bird {

    public Eagle(String breed) {
        super("Eagel");
      
    }

    @Override
    public void fly() {
       System.out.println("Eagle is Flying ");
    }

}
