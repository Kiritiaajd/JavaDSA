

public class BinarSrarch01 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 5, 6, 6, 7};
        int target = 5;
        int index = IndexOfElement(arr, target);
        System.out.println("Index of element " + target + " is: " + index);
    }

    private static int IndexOfElement(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[start] <= arr[mid]) {
                if (target >= arr[start] && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid] && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1; // If the target is not found
    }
}
