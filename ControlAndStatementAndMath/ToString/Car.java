package ControlAndStatementAndMath.ToString;

public class Car {
    int noOfWheels;
    int noOfdoors;
    int maxSpeed;
    String name;
    String model;
    String CompanyName;

    public Car(int noOfWheels, int noOfdoors, int maxSpeed, String name, String model, String companyName) {
        this.noOfWheels = noOfWheels;
        this.noOfdoors = noOfdoors;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.model = model;
        CompanyName = companyName;
    }

    @Override
    public String toString(){
        return "My car name is " + name ;
    }
    public static void main(String[] args){
        Car swift = new Car(4, 4, 300, "Swift", "No model", "Maruti");

        System.out.println(swift);  // return a Hashcode 
    } 
}
