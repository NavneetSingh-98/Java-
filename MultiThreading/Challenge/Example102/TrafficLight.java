package MultiThreading.Challenge.Example102;

public class TrafficLight extends Thread{

    private final TrafficColor trafficColor;

    public TrafficLight(TrafficColor trafficColor) {
        this.trafficColor = trafficColor;
    }

    @Override
    public void run(){
        System.out.printf("\n Color active ",trafficColor);
    
      try {
        Thread.sleep(trafficColor. getOnTimeIn());
    } catch (InterruptedException e) {
       throw new RuntimeException(e);
    }
     System.out.printf("%s Color is InActive \n " , trafficColor);
   }
}


