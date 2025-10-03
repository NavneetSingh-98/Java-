package MultiThreading.Challenge.Challenge102;

public class TrafficLight extends Thread{

   private final TrafficColor color;  // color 

   public TrafficLight(TrafficColor color) {  // Connstrutor 
    this.color = color;
   }
   @Override
   public void run(){
    System.out.printf("%s Color Active \n" , color);

    try {
        Thread.sleep(color.getOnTiimeInMillis());
    } catch (InterruptedException e) {
       throw new RuntimeException(e);
    }
     System.out.printf("%s Color is InActive \n " , color);
   }

   
}
