package OOPS.AbstractionAndPolymorphism.Abstraction.Challenge83try;

public class TestShapes {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        Square s1 = new Square(10);



        System.out.printf("Circle Area is : %4.5f \n", c1.calculateArea());
        System.out.printf("Square Area is :%5.5f ", s1.calculateArea());
    }

}
