package MultiThreading.Challenge.Challenge99;

public class HelloThread extends Thread {

    private final int threadNumber;

    public HelloThread(int thredNumber){
        this.threadNumber = thredNumber;
    }

    @Override
    public void run(){
        for(int i = 0; i< 10; i++){
            System.out.printf("\n(%d) Hello From THread - %d ",i+1,threadNumber);
        }

    }

}
