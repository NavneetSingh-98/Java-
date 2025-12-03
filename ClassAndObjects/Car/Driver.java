package ClassAndObjects.Car;

public class Driver {
    public static void main(String[] args) {

    //     Car myCar = new Car();  //Object Creation 

    //     myCar.addFuel(10);
    //    myCar.drive();
    //    myCar.drive();
       
    //     System.out.println(myCar.getCurrentFuelLevel());

    Car swift = new Car("White");
    swift.addFuel(10);
    swift.start();

    Car car = new Car("Yellow"); 
    car.addFuel(10);
    car.drive();
    car.drive();

    System.out.println(car.color);
        System.out.println("Your color is " + swift.color);
        System.out.println("Max Speed is "+ swift.maxSpeed);
        System.out.println(swift.noOfWheels);  
    }

        

}
