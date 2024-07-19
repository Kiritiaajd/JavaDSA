import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] exampleArray = {64, 25, 12, 22, 11};
        System.out.println("Original Array:");
        System.out.println(Arrays.toString(exampleArray));
        
        SelectionSorting(exampleArray);
        
        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(exampleArray));
    }

    static int getmatIndex(int arr[], int start, int last) {
        int max = start;
        for (int i = start; i <= last; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void SelectionSorting(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            // find the maximum element of the array and move it to the last index
            int last = arr.length - i - 1;
            int maxIndex = getmatIndex(arr, 0, last);
            // swap the found maximum element with the element at the last index
            swap(arr, maxIndex, last);
        }
    }
}
