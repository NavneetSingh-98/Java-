package MultiThreading.Thread.NewThread;

public class FourthClass extends Thread {

    // Fourth Class

     @Override
    public void run(){
        for(int i = 0 ; i< 100; i++){
            System.out.printf("%d & ", i);
        }
        System.out.printf("\n %s & Task is Completed ", Thread.currentThread().getName());
    }


}
