package CollectionAndGenrics.Varargs;

public class TestVarargs {
    public static void main(String[] args) {
        System.out.println(sum(3,5,8));
        System.out.println(sum(4,5, 6,6,7,3));
        
    }
    public static  int sum(int first , int second , int...a){
        int sum = first + second;
        for(int i : a){
            sum +=i;
        }
        return  sum;
    }

}
