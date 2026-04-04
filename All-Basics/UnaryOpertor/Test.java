package UnaryOpertor;

public class Test {
    public static void main(String[] args) {

        //PreIncrement -> Increase the value then use the value 
        int x  = 6;
        int y = ++x;
        System.out.println(y);

        //PreDecrement - > Decrease the value then use 
        int a = 10;
        int b = --a;
        System.out.println(b);

        // Post Increment - > Use the value then increment 
        int c = 15;
        int d = c++;
        System.out.println(d);

        //Post Decrement  -> use The Value then Decrement 
        int f = 8;
        int g = f--;
        System.out.println(g);
    }

}
