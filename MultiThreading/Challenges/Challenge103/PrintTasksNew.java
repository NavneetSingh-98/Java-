package MultiThreading.Challenges.Challenge103;

public class PrintTasksNew implements Runnable{

    @Override
    public void run() {
              // PrintTaskNew
          for(int i = 0; i< 10; i++){
            System.out.printf("Number is : %d\n ",i+1);
        }
      
    }
  

}
