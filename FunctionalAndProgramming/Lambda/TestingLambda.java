package FunctionalAndProgramming.Lambda;

public class TestingLambda {
    public static void main(String[] args) {
        TestingLambda test = new TestingLambda();
        int sum = test.sum(5, 5);
        test.printString("This is the JAVA Course ");

        // toPrint -> System.out.println(toPrint);
        // (a,b) -> a+ b;

        // MultiLine 
        // (a, b) -> {
        //  int sum = a+ b;
        // System.out.println(sum); 
        //}
        
    }
    public void printString(String toPrint){
        System.out.println(toPrint);
    }
    public int sum(int a , int b){
        int sum = a+ b;
        return sum;
    }

}
