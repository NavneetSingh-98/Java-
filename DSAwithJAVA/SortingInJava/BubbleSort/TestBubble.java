package DSAwithJAVA.SortingInJava.BubbleSort;

public class TestBubble {
    public static void main(String[] args) {
        //Bubble sort 
        int arr[] = {9,8,7,4,3,6,12,2,13};

        // Outer Loop 
        for(int i = 0; i< arr.length-1; i++){
            //Inner Loop
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){

                       //Swap
                 int temp = arr[j];
                 arr[j] = arr[j+1];
                 arr[j+1] = temp;

                }
            }
        }
        printArray(arr);
    }
    public static void printArray(int arr[]){
        for(int i= 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
