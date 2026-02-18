package OOPS.EncapsulationAndInheritance.GettersSetters;

public class Car {

    private String color; //public acces 
    private String model; //public acces 
    private double fuelLevel;
    private long costOfPurchase; //defalut acces 

    

    public Car(String color, String model, double fuelLevel, long costOfPurchase) {
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.costOfPurchase = costOfPurchase;
    }

      public String getColor(){
        if(color == "yellow"){
            System.out.println("Pagal hai kya");
        }else{
            System.out.printf("Your color is %s" , color);
        }
        return color;
      }
      public String getModel(){
        return model;
      }



}
