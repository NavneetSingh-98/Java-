package DSAwithJAVA.AdvancedPatternsInJava;

public class PalindromicPattern {
    public static void main(String[] args) {
        System.out.println("Palindromic Pattern ");

        int n = 5;
        for(int i =1; i<= n; i++){
            //space
            for(int j=1; j<= n-i; j++){
                System.out.print(" ");
            }
           for(int j=i; j>= 1; j--){
            System.out.print(j);
           }
           //second half
           for(int j=2; j<=i; j++){
            System.out.print(j);
           }
           System.out.println();
        }
    }

}
