package MultiThreading.Challenge.Challenge100;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        ThreadState t1 = new ThreadState();

        System.out.printf(" \n Create thread  %s ",t1.getState());

        t1.start();

        t1.join();
        System.out.printf("\n Thread finished %s ",t1.getState());

        // Total Time Taken 
        
        long endtime = System.currentTimeMillis();
        System.out.printf("Total Time Taken is : %d ",endtime - startTime);
    }
}
