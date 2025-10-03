package DSAwithJAVA.SortingInJava.SelectionSort;

public class Selection {
    public static void main(String[] args) {
        //Selection Sort 
        int arr[] = {2,4,5,6,4,6,7,8,67,56,43,23,12,12,3,424,56,35,78,67,56};

        for(int i=0; i<arr.length-1; i++){
            int smallest = i; 
            for(int j = i+1; j<arr.length; j++){
                if(arr[smallest] > arr[j]){
                    smallest= j;

                }
            }
             //swap
                    int temp = arr[smallest];
                    arr[smallest] = arr[i];
                    arr[i] = temp;
            
        }
        print(arr);
    }
    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

}
