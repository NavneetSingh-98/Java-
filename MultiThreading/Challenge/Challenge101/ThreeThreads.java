package MultiThreading.Challenge.Challenge101;

public class ThreeThreads extends Thread
{

    private final int threadNumber;

    public ThreeThreads(int threadNumber){
        this.threadNumber = threadNumber;
    }
    @Override
    public void run(){
         for(int i = 1; i< 20; i++){
        System.out.printf("\n (%d)Hello THread From : %d ",i+1, threadNumber);
    }

    }
   

}
