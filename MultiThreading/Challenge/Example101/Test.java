package MultiThreading.Challenge.Example101;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();

        ExampleThree t1 = new ExampleThree(1);
        ExampleThree t2 = new ExampleThree(2);
        ExampleThree t3 = new ExampleThree(3);

        
            t1.start();
            t1.join();

            t2.start();
            t2.join();

            t3.start();
            long endTime = System.currentTimeMillis();
            System.out.printf("Total Time taken is : %d ", endTime - startTime);
        
    }

}
