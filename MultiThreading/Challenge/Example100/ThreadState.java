package MultiThreading.Challenge.Example100;

public class ThreadState  extends Thread{

    @Override 
    public void run(){
        try{
            Thread.sleep(5000);
            System.out.printf("\n from inside run %s", getState());
        }catch(InterruptedException e){
            System.out.printf("Exception occured due to : %s ", e.getMessage());
        }

    }

}
