package DSAwithJAVA.BackTracking;

public class Backtracking {
    public static void main(String[] args) {
        
        // Backtracking  
        String str = "ABC";
        printPermutataion(str, "", 0);

    }
    public static void printPermutataion(String str , String perm , int idx){

        if(str.length() == 0){
            System.out.println(perm);
            return;
        }
        for(int i= 0; i<str.length(); i++){
            char currChar = str.charAt(i);
            String newStr = str.subSequence(0, i) + str.substring(i+1);
      
            printPermutataion(newStr, perm+currChar, idx+1);
        }

    }
}
