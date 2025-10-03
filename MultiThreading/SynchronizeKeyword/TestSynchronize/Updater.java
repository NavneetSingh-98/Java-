package MultiThreading.SynchronizeKeyword.TestSynchronize;

public class Updater extends Thread{

    private final Counter counter;

    public Updater(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run(){
        for(int i = 0 ; i< 100 ; i++){
            counter.increment();
        }
    }

}
