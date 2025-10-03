package DSAwithJAVA.SortingInJava.SelectionSort;

public class ChechSelection {
    public static void main(String[] args) {
        //Selection Sort 
        int[] arr = {27,65,3,45,3,1,4};
        for(int i=0; i<arr.length-1; i++){
            int smallest = i; 
            for(int j =i+1; j<arr.length; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            //swap
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;

        }
        printArray(arr);
    }
    public static void printArray(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }

}
