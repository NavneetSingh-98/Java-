package DSAwithJAVA.SortingInJava.InsertionSort;

public class InsertionSort {
    public static void main(String[] args) {
        //Insertion Sort 
        int[] arr = {2,3,4,8,9,6,3};

        for(int i= 0; i<arr.length; i++){
            int current = arr[i];
            int j = i-1;
            while(j>= 0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
                //placemnent 
                arr[j+1] = current;
            }

        }
        print(arr);
        }
        public static void print(int arr[]){
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i]+ " ");
            }
        }

}
