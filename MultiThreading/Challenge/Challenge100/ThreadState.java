package MultiThreading.Challenge.Challenge100;

public class ThreadState extends Thread{

    @Override
    public void run(){
        try {
            Thread.sleep(5000);
            System.out.printf("\n From inside run %s ",getState());
        } catch (InterruptedException e) {
           throw new RuntimeException(e);
        }
    }

}


