package MultiThreading.Challenge.Example101;

public class ExampleThree extends Thread {

    private final int threadNumber;

    public ExampleThree(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override 
    public void run(){
        for(int i = 0; i< 20 ; i++){
            System.out.printf("\n (%d) Hello from Thread - %d ", i+1, threadNumber);
        }
    }

}
