package DSAwithJAVA.PatternsInJava;

public class HalfPyramid {
    public static void main(String[] args) {
    System.out.println("Half Pyramid");

    int row = 4;

    //Outer Loop
    for(int i = 1; i<= row; i++){
        //Inner Loop 
        for(int j =1; j<=i; j++){
            System.out.print(" * ");
        }
        System.out.println("");
    }
    }

}
