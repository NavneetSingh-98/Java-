package OOPS.EncapsulationAndInheritance.AccesModifiers.Test;

public class Truck {
     
    //public access modifiers 
    public String model;
    public String color;
    public String tyres;
    //private modifires 
    private String cost;
    private String fule;
    private String automatic;

    //Constructor
    public Truck(String model, String color, String tyres, String cost, String fule, String automatic) {
        this.model = model;
        this.color = color;
        this.tyres = tyres;
        this.cost = cost;
        this.fule = fule;
        this.automatic = automatic;
    }
//toString 
    @Override
    public String toString() {
        return "Truck [model=" + model + ", color=" + color + ", tyres=" + tyres + ", cost=" + cost + ", fule=" + fule
                + ", automatic=" + automatic + "]";
    }

    

    


    

}
