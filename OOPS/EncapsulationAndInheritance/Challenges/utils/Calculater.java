package OOPS.EncapsulationAndInheritance.Challenges.utils;

import OOPS.AbstractionAndPolymorphism.Challenge83.Circle;
import OOPS.EncapsulationAndInheritance.Challenges.geometry.Rectangle;

public class Calculater {
public static void main(String[] args) {
    Circle circle = new Circle(5);
    Rectangle rectangle = new Rectangle(5, 5);

    long cirArea = (long) (Math.PI*  circle.radius * circle.radius);
    int rectArea = rectangle.length * rectangle.width;

    System.out.printf("Your Circle area is %d " , cirArea);
    System.out.printf("Your Reactangle area is %d " , rectArea);
}

}
