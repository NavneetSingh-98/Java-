package ControlAndStatementAndMath.Challenges;

public class Construtor {

    // final int noOfWheels;
    // final int noOfDoors;
    // final String engineInLiters;
    
    // public Construtor(int noOfWheels, int noOfDoors, String engineInLiters) {
    //     this.noOfWheels = noOfWheels;
    //     this.noOfDoors = noOfDoors;
    //     this.engineInLiters = engineInLiters;
    // }

    final int noOfDoors;
    final int noOfTires;
    final int maxSpeed;
    final String model;
    final String name;

    public Construtor(int noOfDoors, int noOfTires, int maxSpeed, String model, String name){
        this.noOfDoors = noOfDoors;
        this.noOfTires = noOfTires;
        this.maxSpeed = maxSpeed;
        this.model = model;
        this.name = name;
    }
    

}
