package MultiThreading.Challenges.Challenge103;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecuter {
    public static void main(String[] args) {
        
        ExecutorService service = Executors.newSingleThreadExecutor();

       PrintTasksNew printTasksNew = new PrintTasksNew();

       service.submit(printTasksNew);
       service.shutdown();
 
    }

}
