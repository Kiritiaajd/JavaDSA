

import java.util.Arrays;

public class InsertionSort {
       
    public static void main(String[] args) {
        int arr[] = {1,4,3,6,7,9,4};
        InsertionSorting(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static void InsertionSorting( int arr[]){
       
         for (int i = 0; i < arr.length-1; i++) {
             for (int j = i+1; j >0; j--) {
                  if (arr[j] < arr[j-1]) {
                     swap(arr , j , j-1 );
                     
                  }
             }
            
         }
    }
} 