package ClassAndObjects.Car;

public class Car {
  

   // Strings 
     int noOfWheels;
     String color;
     float maxSpeed;
     float currentFielInLiters;
     int noOfSeats;

     //Constructor 
     Car(String color){
      noOfWheels = 4;
      this.color =color;
      maxSpeed = 300;
      currentFielInLiters = 5;

     }
     //Method
     public void start(){
      if(currentFielInLiters == 0){
         System.out.println("Car in out of fuel ");
      }else if(currentFielInLiters < 5){    
         System.out.println("Car is an Reversed Mode Please refule ");
         currentFielInLiters--;

      }else{
         
        System.out.println("Car is Started ");
        currentFielInLiters--;
      }
      }
      //Methods
       public void drive(){
      if(currentFielInLiters == 0){
         System.out.println("Car in out of fuel ");
      }else if(currentFielInLiters < 5){
         System.out.println("Car is an Reversed Mode Please refule ");
         currentFielInLiters--; 
      }else{
         
        System.out.println("Car is driving");
        currentFielInLiters--;

      }
     }
     public void addFuel(float fuel){
        this.currentFielInLiters = currentFielInLiters + fuel;

     }
     public float getCurrentFuelLevel(){
        return currentFielInLiters;                                                             
     }
}
