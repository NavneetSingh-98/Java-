package MultiThreading.NeedOfMultiThreading;

public class ExampleThread {
    public static void main(String[] args) {

       long StartTime = System.currentTimeMillis();
        
        // First Task 
        System.out.println("Welcome in the Need Of multiThreading ");

        for(int i = 0; i<= 100; i++){
            System.out.printf("%d , @",i);
        }
         System.out.println("\n @ Task Completed  ");
          // Second Task 
    for(int i = 0; i< 100; i++){
        System.out.printf("%d #",i);
    }
    System.out.println("\n # Task Completed ");

    // Third Task 
    for(int i = 0; i<100; i++){
            System.out.printf("%d & ",i);
            System.out.println("\n & Task Completed ");
        } 
        long endTime = System.currentTimeMillis();
        System.out.printf( "Total Time Taken is %d :  ",endTime - StartTime); 
    }
    }

  



