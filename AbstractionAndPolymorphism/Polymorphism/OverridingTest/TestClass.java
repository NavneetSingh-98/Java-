package AbstractionAndPolymorphism.Polymorphism.OverridingTest;

public class TestClass {
    public static void main(String[] args) {
        Cow cow = new Cow();
        Dog dog = new Dog();
        Horse horse = new Horse();

        cow.sound();
        dog.sound();
        horse.sound();
    }

}
