package DSAwithJAVA.AdvancedPatternsInJava;

public class NumberPyramid {
    public static void main(String[] args) {
    System.out.println("Number Pyramid");

    int n= 5; 

    for(int i = 1; i<= n; i++){
        //space
        for(int j= 1; j<=n-i; j++){
            System.out.print(" ");
        }
        for(int j = 1; j<= i; j++){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    }

}
