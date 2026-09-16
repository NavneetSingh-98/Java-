package OOPS.ClassAndObjects.Train;

public class Driven {
    public static void main(String[] args) {
        Trains trains = new Trains("Black");
        trains.addFuel(600);
        trains.start();
        trains.drive();
        
    }

}
