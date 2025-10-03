package MultiThreading.ExecuterService.MultipleThreadExecuter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MultipleExecuterService {
    public static void main(String[] args) throws InterruptedException {
        
        ExecutorService service = Executors.newFixedThreadPool(5);


        PrintTasks t1 = new PrintTasks('@');
        PrintTasks t2 = new PrintTasks('!');
        PrintTasks t3 = new PrintTasks('#');
        PrintTasks t4 = new PrintTasks('*');
        PrintTasks t5 = new PrintTasks('%');

        service.submit(t1);
        service.submit(t2);
        service.submit(t3);
        service.submit(t4);
        service.submit(t5);

        service.shutdown();
        System.out.println("\n************1");

       if(!service.awaitTermination(5,TimeUnit.SECONDS)){
         System.out.println("\n************2");
         service.shutdownNow();

       }

       
          

          


    }

}
