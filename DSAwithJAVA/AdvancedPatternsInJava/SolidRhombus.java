package DSAwithJAVA.AdvancedPatternsInJava;

public class SolidRhombus {
    public static void main(String[] args) {
        
        System.out.println("Pattern of Solid Rhombus ");

        int n = 5;
        for(int i =1; i<= n; i++){
            //Space
            for(int j = 1; j<= n-i; j++){
                System.out.print(" ");
            }
            //Star
            for(int j = 1; j<= 5; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
