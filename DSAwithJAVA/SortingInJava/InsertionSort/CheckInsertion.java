package DSAwithJAVA.SortingInJava.InsertionSort;

public class CheckInsertion {
    public static void main(String[] args) {
        
        int[] arr = {3,4,5,2,7,8,5,3,5};

        for(int i=0; i<arr.length; i++){
            int current =arr[i];
            int j = i-1; 
            while(j>= 0 && current <arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        print(arr);
    }
    public static void print(int arr[]){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        
        }
    }

}
