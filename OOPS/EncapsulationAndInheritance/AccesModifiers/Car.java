package OOPS.EncapsulationAndInheritance.AccesModifiers;

public class Car {

    // Acces Modifiers Have four Type    - Public 
                                    //   - Protected 
                                    //   - Private
                                    //   - Default

        //Private 
    // public String color;

    // public String model;

    // private double fuel;

    // private long costOfPurchase;

    // public Car(String color, String model, double fuel, long costOfPurchase) {
    //     this.color = color;
    //     this.model = model;
    //     this.fuel = fuel;
    //     this.costOfPurchase = costOfPurchase;
    // }
    // public Car(){

    // }

    // @Override
    // public String toString() {
    //     return "Car [color=" + color + ", model=" + model + ", fuel=" + fuel + ", costOfPurchase=" + costOfPurchase
    //             + "]";


                
    // }
  public  String color; // Color will be public 
  public int noOfTyre;
  public  String model;  // model will be public 
   private double fuel;  // fuel  will not  be public 
  private long costOfPurchase; // cost will not be public 


    public Car(String color, String model, double fuel, int costOfPurchase) {
        this.color = color;
        this.model = model;
        this.fuel = fuel;
        this.costOfPurchase = costOfPurchase;
    }
    public Car(){

    }
    @Override
    public String toString() {
       return "Car [ color=" + color + "model"+ model+ "fuel"+ fuel+ "costOfPurchase"+ costOfPurchase+"]";
    }

    
}
