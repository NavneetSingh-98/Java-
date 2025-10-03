package MultiThreading.SynchronizeKeyword;

public class TestingSynchronize {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        Counter counter = new Counter();
        UpdaterThread t1 = new UpdaterThread(counter);
        UpdaterThread t2 = new UpdaterThread(counter);

      

        try {
            t1.start();
            t1.join();
            
            t2.start();
            t2.join();

        } catch (InterruptedException e) {
           
        System.out.printf("Intrupted Exception ",e.getMessage());
        }
        long endTime = System.currentTimeMillis();
        
       System.out.printf("Final Counter value : %d and Total Time taken is : %d ",counter.getCount(),endTime-startTime);
       
    }

}
