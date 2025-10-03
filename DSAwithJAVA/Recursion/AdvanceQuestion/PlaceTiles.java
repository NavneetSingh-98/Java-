public class PlaceTiles {
    public static void main(String[] args) {
        
        // Place Tiles of size 1xm in the floor of size n * m 
        int n=4, m=2;
       System.out.println(placeTiles(n, m));

    }
    public static int placeTiles(int n , int m){

        if(n ==m){
            return 2;
        }
        if(n <m){
            return 1;
        }

        //verticels place 
        int verticlePlacement = placeTiles(n-m, m);

        //horizontaly place 
        int horizontaPlacement = placeTiles(n-1, m);

        return verticlePlacement + horizontaPlacement;

    }
}
