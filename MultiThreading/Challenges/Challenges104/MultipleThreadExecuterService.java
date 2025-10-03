package MultiThreading.Challenges.Challenges104;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MultipleThreadExecuterService {
    public static void main(String[] args) {

        try (ExecutorService service = Executors.newFixedThreadPool(3)) {

            for (int i = 0; i < 10; i++) {
                SleepTask task = new SleepTask();
                service.submit(task);
                
            }
            // service.shutdown();

            if(!service.awaitTermination(10, TimeUnit.SECONDS)){
                System.out.println("EMERGENCY SHUTDOWN");
                service.shutdown();
            }
            }catch(InterruptedException e){
                throw new RuntimeException(e);
            }
        }

    }


