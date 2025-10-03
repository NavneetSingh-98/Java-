package DSAwithJAVA.PatternsInJava;

public class HollowRectangle {
    public static void main(String[] args) {
        
        System.out.println("Printing Pattern of Hollow Rectangle ");

        int row = 4;
        int col = 5;

        //Outer loop 
        for(int i = 1; i<=row; i++){
            // Inner Loop 
        for(int j=1; j<= col; j++){

            if(i == 1 || j== 1 || i == row || j == col){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
           
        }
        System.out.println("");
        }
    }

}
