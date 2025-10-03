package DSAwithJAVA.Recursion.Recursive;

public class NaturalNumber {
    public static void main(String[] args) {
        
        //Print n natural Number 
        sum(1, 10, 0);

    }
    public static void sum(int i, int n, int sum){

        if(i ==n){
            sum = sum+i;
            System.out.println(sum);

            return ;
        }

        sum = sum+i;
        sum(i+1, n, sum);
        System.out.println(i);
    }

}
