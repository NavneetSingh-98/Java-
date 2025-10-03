package MultiThreading.ExecuterService.Future;

import java.util.concurrent.Callable;

public class FetchName implements Callable<String>{

    private final String name;

    public FetchName(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        System.out.printf(" \n Getting full name  %s from Server ",name );
        Thread.sleep(4000);
       return name + " Rajput";
    }

}
