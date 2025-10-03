package MultiThreading.Challenges.Challenges104;

public class SleepTask implements Runnable{

    @Override
    public void run() {
       Thread current = Thread.currentThread();
       System.out.printf("Started Thread : %s\n",current.getName());
       try {
        Thread.sleep(getRandom() * 1000);
    } catch (InterruptedException e) {
    
        e.printStackTrace();
    }
    System.out.printf("Ended Thread : %s \n",current.getName());
    }
    private int getRandom(){
        double random = Math.random() * 5 + 1;
        return (int)random;
    }

}
