package DSAwithJAVA.PatternsInJava;

public class InvertedHalfPattern {
    public static void main(String[] args) {
        
        System.out.println("Inverted Half Pattern ");

        int col = 4;

        //Outer loop 
        for(int i = 4; i>= 1; i-- ){
            //Inner loop 
            for(int j = 1; j<= i; j++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }

    }

}
