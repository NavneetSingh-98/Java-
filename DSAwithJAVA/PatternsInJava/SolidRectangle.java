package DSAwithJAVA.PatternsInJava;

public class SolidRectangle {
    public static void main(String[] args) {
        
        System.out.println("Printing Solid Rectangle Pattern ");

        int row = 4;
        int col = 5;

        // Outer Loop 
        for(int i = 1; i<= row; i++){
            // Inner Loop 
            for(int j = 1; j<= col; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

}
