package DSAwithJAVA.SortingInJava.BubbleSort;

public class BubbleSortTest {
    public static void main(String[] args) {
        System.out.println("Bubble sort test ");

        int[] arr = {1,2,3,4,3,55,4,3,22,112,34,2,3,4223,4,23};

        for(int i= 0; i<arr.length -1; i++){
            for(int j= 0; j<arr.length -i-1; j++){
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
        public static void  printArray(int arr[]){

              for(int i= 0; i< arr.length; i++){
                System.out.println(arr[i] + " ");
        }
        
      
    }

}
