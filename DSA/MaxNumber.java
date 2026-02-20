public class MaxNumber {
    public static void main(String[] args) {
        int[] arr = {2,4,66,12,78,99,89,76,45,101};
        System.out.println("Your max element is : " + maxElement(arr));
    }
    public static int maxElement(int[] arr){
        int max = arr[0];
        for(int i = 1; i< arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
