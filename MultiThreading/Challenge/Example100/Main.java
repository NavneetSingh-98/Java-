package MultiThreading.Challenge.Example100;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();

        ThreadState t1 = new ThreadState();

        System.out.printf(" \n Create thread  %s ",t1.getState());
        t1.start();

        t1.join();

        System.out.printf("\n Thread Finished %s ", t1.getState());

        long endTime = System.currentTimeMillis();
        System.out.printf("Total Time Taken is : %s ", endTime - startTime );

    }

}
