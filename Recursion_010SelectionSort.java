import java.util.Arrays;

public class Recursion_010SelectionSort {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 6, 1, 5 };
        // SelectionSort(arr);
        // System.out.println(Arrays.toString(arr));

        SSRecursive(arr, 0, 0, 0);
        System.out.println(Arrays.toString(arr));

    }

    static void SelectionSort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted part of the array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element of the unsorted part
            swap(arr, i, minIndex);
        }
    }

    static void  SSRecursive(int arr[] , int i , int j , int minIndex){
        if (i == arr.length - 1) { // Base case: End of array
            return;
        }

        // If we have reached the end of the array in the inner loop
        if (j == arr.length) {
            swap(arr, i, minIndex); // Swap the found minimum with the first element of the unsorted part
            SSRecursive(arr, i + 1, i + 1, i + 1); // Move to the next element and reset j and minIndex
        } else {
            if (arr[j] < arr[minIndex]) {
                minIndex = j; // Update minIndex if a smaller element is found
            }
            SSRecursive(arr, i, j + 1, minIndex); // Continue the inner loop
            //SSRecursive(arr, i, i+1, minIndex); // Wrong line: j should be incremented, not i
        }
    }

    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
