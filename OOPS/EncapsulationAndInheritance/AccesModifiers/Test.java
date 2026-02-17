package OOPS.EncapsulationAndInheritance.AccesModifiers;

public class Test {
    public static void main(String[] args) {

        // Acces Modifiers Test 

        // Car car = new Car();
        // car.color = "Red";
        // car.model = "Thar";
        // System.out.println(car);

        // Car newCar = new Car("Black","BMW",2,5000);
        // System.out.println(newCar);

        // System.out.println("Program is Ended ");
        Car car = new Car();
        car.color = "Black";
        car.noOfTyre = 4;
  
       
        car.model = "Bmw ";
        System.out.println(car);
        Car newCar = new Car("Black","BMW",2,50000);
        System.out.println(newCar);
                                        
    }

}
