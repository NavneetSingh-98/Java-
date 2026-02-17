package OOPS.EncapsulationAndInheritance.Challenges.utils;

import OOPS.AbstractionAndPolymorphism.Challenge83.Circle;
import OOPS.EncapsulationAndInheritance.Challenges.geometry.Rectangle;

public class Calculater {
    public static void main(String[] args) {
        
        Circle cir = new Circle(6);
        Rectangle rect = new Rectangle(5, 8);

        double cirArea = Math.PI * Math.pow(cir.radius,2);
        int rectArea = rect.length * rect.width;

        System.out.printf("Area of Circle is : ", cirArea);
        System.out.printf("Area of Rectangle is : %d ",rectArea);
    }

}
