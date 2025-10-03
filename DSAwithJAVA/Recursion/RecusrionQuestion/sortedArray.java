package DSAwithJAVA.Recursion.RecusrionQuestion;

public class sortedArray {
 public static void main(String[] args) {
    int arr[] = {1,2,3,4,5,4};
    System.out.println(isSorted(arr, 0));   // Function call 
 }
 public static boolean isSorted(int arr[] , int idx){
    // if Condition 
    if(idx == arr.length -1){
        return true;
    }
    if(arr[idx] < arr[idx+1]){
        // array is sorted  
       return  isSorted(arr, idx + 1);  //Recursive Function
    }else{
        return false;  // Return Statement 
 
    }
 }
}
