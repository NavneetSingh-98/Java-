package DSAwithJAVA.PatternsInJava;

public class InvertedPyramid {
    public static void main(String[] args) {
        System.out.println("Inverted Half Pyramid Rotated 180 deg ");

        int row =  4;

        for(int i = 1; i<= row; i++){
            // Inner Loop Space Print 
            for(int j = 1; j<=row-i; j++){
                System.out.print(" ");
            }
            // Inner Loop Str Print 
            for(int j = 1; j<= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
