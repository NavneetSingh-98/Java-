package AbstractionAndPolymorphism.Challenge83;

public class TestShape {
   public static void main(String[] args) {
    

  Circle circle = new Circle(7);
  Square square = new Square(5);

  System.out.printf("Area is  : %4.5f \n",circle.calculateArea());
  System.out.printf("Area of square :  %5.5f ",square.calculateArea());
   }
}
