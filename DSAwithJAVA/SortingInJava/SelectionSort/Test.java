package DSAwithJAVA.SortingInJava.SelectionSort;

public class Test {
    public static void main(String[] args) {
        //Selection Sort 
        int arr[] = {2,3,4,56,7,8};
        for(int i=0; i<arr.length-1; i++){
            int smallest = i; 
            for(int j=i+1; j<arr.length; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
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
        for(int i= 0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
    }

}
