package EncapsulationAndInheritance.AccesModifiers;

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
  public  String color;
  public  String model;
  private  double fuel;
  private long costOfPurchase;


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
