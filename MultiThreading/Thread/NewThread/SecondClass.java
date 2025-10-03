package MultiThreading.Thread.NewThread;

public class SecondClass extends Thread{

    // Second Class


    @Override
    public void run(){
        for(int i = 0 ; i< 100; i++){
            System.out.printf("%d # ", i);
        }
        System.out.printf("\n %s # Task is Completed ", Thread.currentThread().getName());
    }

}
