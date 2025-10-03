package MultiThreading.Thread;

public class SecondTask extends Thread{

    @Override
    public void run() {
       
                // Task 2

        for(int i = 1; i<= 1000; i++){
            System.out.printf("%d &",i);
        }
        System.out.printf("\n %s & Task is Completed ",
         Thread.currentThread().getName());
    }

}
