import java.util.Arrays;

class SortingAlgos{
    // private int arr[] = { 1 ,24 ,4,6,23,8 , 12, 45, 67,90};
    public void BubbleSort(int arr[]  , int i , int j ){
           if (i == arr.length-1) {
              return;
           }
           if (j < arr.length-i-1) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                BubbleSort(arr, i, j+1);
           }
           else{
               BubbleSort(arr, i+1, 0);
           }
        
    }

    public void SelectionSort(int arr[] , int i , int j ){
            if (i == arr.length -1) {
                return ;
            }
            int min_index = i;
            if (j < arr.length) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
                SelectionSort(arr, i, j+1);
            }else{
                
            }

    }
}


public class OOPSJavaSortingPractice {
    public static void main(String[] args) {
        int arr[] = { 1 ,24 ,4,6,23,8 , 12, 45, 67,90};
        SortingAlgos sa = new SortingAlgos();
        sa.BubbleSort(arr, 0, 0);
        System.out.println(Arrays.toString(arr));


    }

}
