package MultiThreading.Challenge.Challenge102;

public class Road {
    public static void main(String[] args) throws InterruptedException {
        
        TrafficLight red    = new TrafficLight(TrafficColor.RED);
        TrafficLight green  = new TrafficLight(TrafficColor.GREEN);
        TrafficLight yellow = new TrafficLight(TrafficColor.YELLOW);

          red.start();
          red.join();

          green.start();
          green.join();

          yellow.start();
        //   yellow.join();
    }

}
