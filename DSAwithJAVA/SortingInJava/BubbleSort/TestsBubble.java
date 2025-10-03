package DSAwithJAVA.SortingInJava.BubbleSort;

public class TestsBubble {
    public static void main(String[] args) {
        //bubble sort 
        int arr[] = {2,4,6,5,4,3,44,33,22,32,23,34,6,7,7,6,5,4,46,7,5};

        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp= arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArray(arr);
    }
    public static void printArray(int arr[]){
        for(int i= 0 ; i<arr.length; i++)
        System.out.print(arr[i] + " ");
    }

}
