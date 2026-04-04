package ControlAndStatementAndMath.Challenges;

import java.util.Scanner;

public class CircumfrenceOfCircle {

    double radiusInMm;

    double getCircumference(){
        return 2* Math.PI * radiusInMm;
    }

    double getArea(){
        return Math.PI * Math.pow(radiusInMm, 2);
    }

    @Override
    public String toString() {
        return "Circle Property : Radius of circle in MM : " + radiusInMm + " Circumference of circle : " + getCircumference() + " Area of circle : " + getArea();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Radius : ");
        int radius = input.nextInt();

        Circle circle = new Circle(radius);
            System.out.println(circle);
        
    }
    

}
