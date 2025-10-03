package MultiThreading.Thread.NewThread;

public class TestThread {
    public static void main(String[] args) {
        
        long startTime = System.currentTimeMillis();

        FirstClass f1 = new FirstClass();
        SecondClass s2 = new SecondClass(); 
        ThirdClass t3 = new ThirdClass();
        FourthClass f4 = new FourthClass();

        System.out.println("\n  Starting  First Thread ");
        f1.start();

         System.out.println("\n  Starting  Second Thread ");
        s2.start();

         System.out.println("\n  Starting  Third Thread ");
        t3.start();

         System.out.println("\n  Starting  Fourth Thread ");
        f4.start();

        long endTime = System.currentTimeMillis();

        System.out.printf("Total Time taken is : %d",Thread.currentThread().getName(), endTime - startTime);
    }

}
