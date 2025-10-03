package DSAwithJAVA.Recursion.RecusrionQuestion.TowerOfHanoi;

public class HanoiTower {
    public static void main(String[] args) {
        int n = 5;
        printTowerHanoi(n, "S", "H", " D");
       
    }
    public static void printTowerHanoi(int n , String src, String helper, String dest){

        if(n ==1){
             System.out.println("transfer disk " + n+ " from " + src + " to " + dest);
             return;
        }
        printTowerHanoi(n-1, src, dest, helper);
        System.out.println("transfer disk " + n + " from " + src + " to" + dest);
        printTowerHanoi(n-1, helper, src, dest);

    }

}
