package DSAwithJAVA.SortingInJava.SelectionSort;

public class TestSelection {
    public static void main(String[] args) {
        //Selection Sort 

        int arr[] = {3,4,5,7,89,56,43,23,12,12,34,23,14};

        for(int i=0; i<arr.length-1; i++){
            int smallest = i;
            for(int j= i+1; j<arr.length; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            //Swap
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        //Finction Calling 
        printArray(arr);
    }
    public static void printArray( int arr[]){
        for(int j=0; j<arr.length; j++){
            System.out.print(arr[j] + " ");
        }
    }

}
