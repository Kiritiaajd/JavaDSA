class Searching {
    public int arr[];

    public int SearchIndex(int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}

/**
 * Sorting
 */
class Sorting {
    private void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void BubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }
}

/**
 * Display
 */
class View {
    public void DisplayArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class BinarySearchPractice {
    public static void main(String[] args) {
        // Initialize Array
        int arr[] = { 1, 29, 5, 60, 7, 8, 9, 10 };
        View display = new View(); // Display array
        System.out.println("RAW ARRAY");
        display.DisplayArray(arr);

        Sorting sort = new Sorting(); // Bubble Sort Function from sorting class
        sort.BubbleSort(arr);
        System.out.println("Array after sorting");
        display.DisplayArray(arr);

        // Searching Using Binary Search from Searching Class
        Searching s = new Searching();
        s.arr = arr;
        System.out.println("Searching for element 10");
        int index = s.SearchIndex(10);
        if (index == -1) {
            System.err.println("Element not found");
        } else {
            System.out.println("Element 10 found at index " + index);
        }
    }
}
