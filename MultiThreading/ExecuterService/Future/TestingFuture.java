package MultiThreading.ExecuterService.Future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestingFuture {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
         ExecutorService service = Executors.newFixedThreadPool(1);

        FetchName f1 = new FetchName("Navneet");
        FetchName f2 = new FetchName("Shivam");
        FetchName f3 = new FetchName("Manju ");
        FetchName f4 = new FetchName("Rajkumar ");

        
        Future<String> name1 = service.submit(f1);
        Future<String> name2 = service.submit(f2);
        Future<String> name3 =  service.submit(f3);
        Future<String> name4 =  service.submit(f4);

        System.out.printf("Full Name is : %s ",name1.get());
        System.out.printf("Full Name is : %s ",name2.get());
        System.out.printf("Full Name is : %s ",name3.get());
        System.out.printf("Full Name is : %s ",name4.get());

        service.shutdown();

    }

}
