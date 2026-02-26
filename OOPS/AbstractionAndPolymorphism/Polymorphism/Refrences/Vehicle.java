package OOPS.AbstractionAndPolymorphism.Polymorphism.Refrences;

public abstract class Vehicle {

    private int noOfTire;

    Vehicle(){
        this.noOfTire = 0;
    }
    Vehicle(int noOfTire){
        this.noOfTire = noOfTire;
    }

    public int getNoOfTire(){
        return this.noOfTire;
        
    }
    public abstract void start();
     

}
