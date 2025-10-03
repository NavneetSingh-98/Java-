package MultiThreading.SynchronizeKeyword;

public class UpdaterThread extends Thread{

    private final Counter counter;

    public UpdaterThread(Counter counter){
        this.counter = counter;
    }
    @Override
    public void run(){
        for(int i = 0; i<= 50; i++){
            counter.increment();

        }
    }
}
