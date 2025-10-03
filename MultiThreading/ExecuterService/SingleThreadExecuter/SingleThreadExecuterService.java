package MultiThreading.ExecuterService.SingleThreadExecuter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import MultiThreading.RunableTask.PrintTask;

public class SingleThreadExecuterService {
    public static void main(String[] args) {
        
      ExecutorService service = Executors.newSingleThreadExecutor();

      PrintTask t1 = new PrintTask('*');
      PrintTask t2 = new PrintTask('@');
      PrintTask t3 = new PrintTask('$');

      service.submit(t1);
      service.submit(t1);
      service.submit(t1);

      service.shutdown();
    }

}
