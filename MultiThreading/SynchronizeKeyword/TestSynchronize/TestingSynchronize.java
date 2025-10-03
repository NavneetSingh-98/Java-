package MultiThreading.SynchronizeKeyword.TestSynchronize;

public class TestingSynchronize {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        Counter counter = new Counter();

        Updater t1 = new Updater(counter);
        Updater t2 = new Updater(counter);
      

        try{
            t1.start();
            t1.join();

            t2.start();
            t2.join();

         
 
        }catch(InterruptedException e ){
            System.out.printf("Exception Occured  : %s ", e.getMessage());

            long endTime = System.currentTimeMillis();
            System.out.printf("Total Time taken is : %d ",counter.getCount(), endTime - startTime);

        }
    }

}
