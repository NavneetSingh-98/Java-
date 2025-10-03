package DSAwithJAVA.Recursion.Recursive;

public class FactorialNumber {
    // public static void main(String[] args) {
    //      //Factorial Number Finder
    //      int num =10;
    //     int result =  facto(num);
    //     System.out.printf("Your factorila is  : %d",result);
        
    // }
    // public static int facto(int num){
    //     if(num ==1 || num == 0){
    //         return 1;
    //     }
    //   int fac =  facto(num-1);
    //   int factro = num* fac;
    //   return factro;
    
public static void main(String[] args) {
    // Print factorial using recursion 
    int num = 10;
     int result =printFibbo(num);
     System.out.printf("Your Factorial is : %d ",result );
}
public static int printFibbo(int num){
    if(num ==1 || num==0){
        return 1;
    }
    int fibbo = printFibbo(num-1);
    int fac = fibbo * num;
    return fac;
}
}