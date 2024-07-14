public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = { -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 ,22 ,78 , 98 , 1001 };
        int target = 9;
        System.out.println(" Index Of target  element is " + IndexofElement(arr, target));

    }

    static int IndexofElement(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
