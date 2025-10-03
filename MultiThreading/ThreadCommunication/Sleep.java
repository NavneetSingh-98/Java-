package MultiThreading.ThreadCommunication;

public class Sleep {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Good Morning ");
        for(int i = 0; i<6; i++){
            Thread.sleep(1000);
            System.out.println(i);
        }
        System.out.println("Good Night ");
        
    }

}
