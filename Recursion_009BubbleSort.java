import java.util.Arrays;

public class Recursion_009BubbleSort {
    public static void main(String[] args) {
        int arr[] = { 1, 5, 6, 3, 7, 8, 4, 3 };
        // System.out.println(Arrays.toString(arr));
        // sortingIterative(arr);
        // System.out.println(Arrays.toString(arr));
        BubbleSortRecursion(arr, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void sortingIterative(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static void BubbleSortRecursion(int arr[], int i, int j) {
        if (i == arr.length - 1) {
            return;
        }
        if (j < arr.length - i - 1) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
            BubbleSortRecursion(arr, i, j + 1);
        }else{
            BubbleSortRecursion(arr, i+1, 0);
        }

    }
}
