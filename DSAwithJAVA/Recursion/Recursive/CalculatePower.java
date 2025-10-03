package DSAwithJAVA.Recursion.Recursive;

public class CalculatePower {
    public static void main(String[] args) {

        // Calculate power using Recursion 
         int x = 2 , n = 5;
         int ans = CalculatePower(x, n);
         System.out.println(ans);
    }
    public static int CalculatePower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 0) {
            return 0;
        }
        int xPower = CalculatePower(x, n-1);
        int xPow = x * xPower;
        return xPow;

    }
}
