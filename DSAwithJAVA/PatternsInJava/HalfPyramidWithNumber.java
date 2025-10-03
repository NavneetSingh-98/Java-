package DSAwithJAVA.PatternsInJava;

public class HalfPyramidWithNumber {
    public static void main(String[] args) {
        System.out.println("Half Pyramid With Numbers ");

        int n = 5;

        //Outer Loop
        for(int i =1; i<= n; i++){
            //Inner Loop 
            for(int j  = 1; j<= i; j++){
                System.out.print(j + " " );
            }
            System.out.println(" ");
        }
    }

}
