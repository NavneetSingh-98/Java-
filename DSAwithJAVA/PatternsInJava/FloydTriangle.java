package DSAwithJAVA.PatternsInJava;

public class FloydTriangle {
    public static void main(String[] args) {
        
        System.out.println("Printing Floyd Pattern ");

        int n = 5;
        int number = 1;

        //Outer Loop
        for(int i = 1; i<=n; i++){
            //Inner Loop 
            for(int j =1; j<= i; j++){
                System.out.print(number + " ");
                number++;  // number = number + 1
            }
            System.out.println();

        }
    }

}
