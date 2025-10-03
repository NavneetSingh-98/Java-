package DSAwithJAVA.Recursion.Recursive;

public class Multiple {
    public static void main(String[] args) {
        
        int num = 1;
        printRecursion(num);
        
    }
    public static void printRecursion(int num){
        if(num == 11){
            return;
        }
        System.out.println(num);
        printRecursion(num +1);

    }
}
