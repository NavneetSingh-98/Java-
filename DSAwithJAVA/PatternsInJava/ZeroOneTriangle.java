package DSAwithJAVA.PatternsInJava;

public class ZeroOneTriangle {
    public static void main(String[] args) {
        
        System.out.println("Printing 0 -1 Triangle ");

        int n= 5;
        //Outer Loop 
        for(int i = 1; i<=n ; i++){
            //Inner Loop 
            for(int j= 1; j<= i; j++){
                int sum = i+j;
                if(sum %2 ==0){
                    System.out.print("1" + " ");

                }else{
                    System.out.print("0" + " ");
                }
            }
            System.out.println();

        }
    }

}
