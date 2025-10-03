
public class CalculateMazePath {
    public static void main(String[] args) {
        // Calculate all path of the Maze using Recursion 
        int n=3, m=3;
      int totalPath =calculateMazePath(0, 0, n, m);
      System.out.println(totalPath);
    }
    // Function Calling to print calculate Maze 
    public static int calculateMazePath(int i, int j, int n, int m){

        if(i == n || j == m){
            return 0;
        }

        if(i == n-1 && j == m-1){
        return 1;
        }
        //move dawn Paths
        int downPaths = calculateMazePath(i+1, j, n, m);

        //move Right Paths
        int rightPaths = calculateMazePath(i, j+1, n, m); 

        //Retur Statement 
        return downPaths + rightPaths;
    }

}
