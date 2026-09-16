package OOPS.AbstractionAndPolymorphism.Polymorphism.TestOverriding;

public class TestClasss {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Duck duck = new Duck();
        Eagel e1 = new Eagel();

        d1.fly();
        d1.run();
        d1.sound();

         duck.fly();
        duck.run();
        duck.sound();

         e1.fly();
        e1.run();
        e1.sound();
    }

}
