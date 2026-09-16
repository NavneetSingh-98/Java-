package OOPS.AbstractionAndPolymorphism.Challenge84try;

public class Bird implements Flyables{

    private final String breed;

    public Bird(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
     
        return breed;
    }

    @Override
    public void fly() {
       System.out.println("I am Bird So i can fly ");
    }

}
