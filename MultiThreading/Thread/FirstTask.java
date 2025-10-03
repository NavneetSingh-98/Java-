package MultiThreading.Thread;

public class FirstTask extends Thread{

    @Override
    public void run() {
             // Task 1 

        for(int i = 1; i<= 1000; i++){
            System.out.printf("%d *",i);
        }
        System.out.printf("\n %s * Task is Completed ",
        Thread.currentThread().getName());
    }

}
