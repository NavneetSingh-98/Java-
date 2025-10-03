package MultiThreading.NeedOfMultiThreading;

public class Tasks {
    public static void main(String[] args) {

       long startTime =  System.currentTimeMillis();
        
        // Task 1 

        for(int i = 1; i<= 1000; i++){
            System.out.printf("%d *",i);
        }
        System.out.println("\n * Task is Completed ");

        // Task 2

        for(int i = 1; i<= 1000; i++){
            System.out.printf("%d &",i);
        }
        System.out.println("\n & Task is Completed ");

        // Task 3

        for(int i = 1; i<= 1000; i++){
            System.out.printf("%d @",i);
        }
        System.out.println("\n @ Task is Completed ");


        long endTime = System.currentTimeMillis();
        System.out.printf("Total Time Taken is %d:", endTime - startTime);
    }

}
