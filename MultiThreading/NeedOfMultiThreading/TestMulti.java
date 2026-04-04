package MultiThreading.NeedOfMultiThreading;

public class TestMulti {
    public static void main(String[] args) {
        System.out.println("Welcome in the MultiThreading ");

        long startTime = System.currentTimeMillis();

        //First Task 
        for(int i = 0; i<= 100; i++){
            System.out.printf("%d , @", i);
        }
        System.out.println(" \n @ First Task Completed");

        //Second Task 

        for(int i = 0; i<= 100; i++){
            System.out.printf("%d , $", i);
        }
        System.out.println("\n $ task Completed ");

        //Third Task 
        for(int i = 0; i<= 100; i++){
            System.out.printf("%d , &", i);

        }
        System.out.println("\n & task Completed ");

        long endTime = System.currentTimeMillis();

        System.out.printf("Total Time Taken is : %d ", endTime - startTime);
  
    }

}
