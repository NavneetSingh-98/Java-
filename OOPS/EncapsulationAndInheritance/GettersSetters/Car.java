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

  public  String getColor(){
        return color;
    }
    public void  setColor(String color){
        if(color.equals("Yellow")){
            System.out.println("Pagal ha kya ");
        }else{
          this.color= color;
        }
      
    }
   
   public String getModel(){
        return model;
    }

  

}
