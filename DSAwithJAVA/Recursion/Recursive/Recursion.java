package DSAwithJAVA.Recursion.Recursive;

public class Recursion {
    public static void main(String[] args) {
        //How to use Recusion Method 
        int num= 1;
        printRecursion(num);

    }

    // Recursion is ASelfCalling Function 
    public static void printRecursion(int num){
        if(num == 21){
            return;
        }
        System.out.println(num);
        printRecursion( num + 1);

    }

}
