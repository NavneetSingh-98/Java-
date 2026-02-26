public class MinNumber {
    public static void main(String[] args) {
        int[] arr = {3,5,6,1,66,55,77,77,89,23};
        System.out.println("Your min value is : " + minElement(arr));
    }
    public static int minElement(int[] arr){
        int min = arr[0];
        for(int i = 1; i< arr.length; i++){
            if(min > arr[i]){
              min = arr[i];
            }
        }
        return min;
    }
    
}
