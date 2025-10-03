package MultiThreading.RunableTask;

public class PrintTask implements Runnable{

    @Override
    public void run() {
    
                     // PrintTask

        for(int i = 1; i<= 1000; i++){
            System.out.printf("%d%c",i,targetChar);
        }
        System.out.printf("\n %s %c Task is Completed ",
        Thread.currentThread().getName(),targetChar);
    }
    private final char targetChar;
    public PrintTask(char targetChar) {
        this.targetChar = targetChar;
    }

    }
