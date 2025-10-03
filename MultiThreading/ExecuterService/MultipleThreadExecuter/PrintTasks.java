package MultiThreading.ExecuterService.MultipleThreadExecuter;

public class PrintTasks implements Runnable{

    @Override
    public void run() {
        
        for(int i = 1; i<= 1000; i++){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
               throw new RuntimeException(e);
            }
            System.out.printf("%d%c",i,targetChar);
        }
        System.out.printf("\n %s %c Task is Completed ",
        Thread.currentThread().getName(),targetChar);
    }

     private final char targetChar;

     public PrintTasks(char targetChar ){
        this.targetChar = targetChar;
     }
    

}
