package MultiThreading.Thread;

public class TestThreadClass {
    public static void main(String[] args) {
        
        long startTime = System.currentTimeMillis();

        FirstTask t1 = new FirstTask();

        SecondTask t2 = new SecondTask();

        ThirdTask t3 = new ThirdTask();

            System.out.println("\n Stating First Thread ");
        t1.start();
            System.out.println("\n Stating Second Thread ");
        t2.start();
            System.out.println("\n Stating Third  Thread ");
        t3.start();

        long endTime = System.currentTimeMillis();
        System.out.printf(" %s Total Time Taken is : %d ",
        Thread.currentThread().getName(),
        endTime - startTime);
    }

}
