package OOPS.ClassAndObjects.Train;



public class Trains {

    int noOfTyre;
    String color;
    int fuleInLiters;
    int noOfSeats;
    float getCurrentFuel;
    
    int  maxSpeed;

    Trains(String color){
        noOfTyre = 50;
        this.color = color;
        fuleInLiters = 500;
        noOfSeats = 100;
        maxSpeed = 400;

    }
    //Method

    public void start(){
        if(fuleInLiters == 0){
            System.out.println("Your train is out of fuel ");
        }else if(fuleInLiters < 100){
            System.out.println("Your Train has not enough fuel , Please refule !");
            fuleInLiters--;
        }else{
            System.out.println("Your train Start");
            fuleInLiters--;
        }
    }

    //Method

    public void drive(){
        if(fuleInLiters == 0){
            System.out.println("Train is out of fuel");
        }else if(fuleInLiters < 300){
            System.out.println("Please refule your train Now you are in reserved !");
            fuleInLiters--;
        }else{
            System.out.println("Your Train is driving");
            fuleInLiters--;
        }
        
    }

    public void addFuel(int fuel){
        this.fuleInLiters = fuleInLiters + fuel;
    }
    public float getCurrentFule(){
        return getCurrentFuel;
    }


}
