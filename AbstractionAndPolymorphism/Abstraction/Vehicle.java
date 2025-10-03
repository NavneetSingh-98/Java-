package AbstractionAndPolymorphism.Abstraction;

public abstract class Vehicle implements Transport {

     private int noOfTyre;

     public abstract void makeStartSound();

    public Vehicle(int noOfTyre) {
        this.noOfTyre = noOfTyre;
    }

    public int getNoOfTyre() {
        return noOfTyre;
    }

    public void setNoOfTyre(int noOfTyre) {
        this.noOfTyre = noOfTyre;
    }
    public void commute(){
        System.out.println(".. Going !");
    }


}
