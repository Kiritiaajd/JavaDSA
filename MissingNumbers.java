// https://leetcode.com/problems/missing-number/

import java.util.Arrays;

public class MissingNumbers {
    public static void main(String[] args) {
            int arr[]= { 0 , 2, 3,5 ,1 ,4 ,7};
            CycleSort(arr);
            System.out.println(Arrays.toString(arr));
            int missingNo = arr.length;  // Default to arr.length if no other missing number is found

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i) {
                missingNo = i;
                break;
            }
        }
         System.out.println(missingNo);
    }

    static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void CycleSort(int arr[]) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
            
        }
    }
}
