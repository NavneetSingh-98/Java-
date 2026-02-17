package OOPS.AbstractionAndPolymorphism.Polymorphism.Overriding;

public class TestAnimal {
    public static void main(String[] args) {
        
        Dog dog = new Dog();
        Cat cat = new Cat();
        Duck duck = new Duck();

        dog.sound();
        cat.sound();
        duck.sound();
    }

}
