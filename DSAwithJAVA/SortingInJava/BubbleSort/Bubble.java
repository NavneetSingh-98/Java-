package DSAwithJAVA.SortingInJava.BubbleSort;

public class Bubble {
    public static void main(String[] args) {
        //bubble sort 
        System.out.println("Welcome in the Bubble sorting ");

        int arr[] = {3,4,2,6,55,44,33,56,78,55,23,2,12,1,34,9,67};

        for(int i=0; i< arr.length-1;i++){
            for(int j =0; j<arr.length-i-1; j++){
            
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArray(arr);
    }
    public static void printArray(int arr[]){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
