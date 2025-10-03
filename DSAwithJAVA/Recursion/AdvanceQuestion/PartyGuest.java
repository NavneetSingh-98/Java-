public class PartyGuest {
    public static void main(String[] args) {
        //Find the number of ways in which you can invite n people 
        //to your party , single or in pairs

        int n = 4;
        int result = calculateGuestWay(n);
        System.out.println(result);

    }
    public static int calculateGuestWay(int n){
        if(n <=1){
            return 1;
        }

        //single
        int ways = calculateGuestWay(n-1);

        //pairs 
        int ways2 = (n-1) *calculateGuestWay(n-2);

        return ways + ways2;
    }

}
