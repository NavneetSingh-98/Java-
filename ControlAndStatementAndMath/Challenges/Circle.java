package ControlAndStatementAndMath.Challenges;

import java.util.Scanner;

public class Circle {

//      double radiusInMm;

//      Circle(double radiusInMm){
//         this.radiusInMm = radiusInMm;
//      }

//      double getCircumference(){
//         return 2* Math.PI * radiusInMm;
//      }

//      double getArea(){
//         return Math.PI * Math.pow(radiusInMm,2);
// }

// @Override
// public String toString(){
//     return "Circle props : Radius in mm :" +radiusInMm
//              + ", Circumference in mm:"+getCircumference()
//              +" , Area in mm " +getArea();
// }
// public static void main(String[] args) {
//     Scanner input = new Scanner(System.in);

//     System.out.println("Welcome in the world of circle ");
//     System.out.print("Enter Your Radius : ");
//     double radius = input.nextDouble();

//     Circle circle = new Circle(radius);
//     System.out.println(circle);

double radiusInMm;

 Circle(double radiusinMm){
   this.radiusInMm = radiusinMm;

 }
 double getCircumference(){
   return 2 * Math.PI * radiusInMm;
 }
 double getArea(){
   return Math.PI*Math.pow(radiusInMm,2);
 }

 @Override
 public String toString() {
    return "Circle Property : Radius Of Circle in mm : "+radiusInMm
                              +"Circumference of Circle : "+getCircumference()+
                              "Area of circle : "+ getArea(); 
 }
 public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.print("Enter Your Radius :");
   double radius = input.nextDouble();

   Circle circle = new Circle(radius);
   System.out.println(circle);
 }
}

