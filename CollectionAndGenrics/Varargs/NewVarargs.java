package CollectionAndGenrics.Varargs;

public class NewVarargs {
    public static void main(String[] args) {
        System.out.println(sum(3, 5, 4));
        System.out.println(sum(4, 2, 3,4,5,6));
        
    }
    public static int sum(int first , int second, int... a){
        int sum = first + second;
        for(int i: a){
            sum += i;
        }
        return sum;
    }

}
