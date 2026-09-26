package CollectionAndGenrics.Enums.Poocess;

public class Main {
    public static void main(String[] args) {
        Status status = Status.valueOf("SUCCESS");
        System.out.println(status);
        
    }
    enum Status{
        FAILED,
        SUCCESS,
        PENDING
    }

}
