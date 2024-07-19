import java.util.Arrays;

public class Bubble_sort {

    public static void main(String[] args) {
        int[] exampleArray1 = { 64, 34, 25, 12, 22, 11, 90 };
        int[] exampleArray2 = { 5, 1, 4, 2, 8 };
        int[] sortedArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.println("Original Array 1:");
        System.out.println(Arrays.toString(exampleArray1));
        Bubble_sortrtig(exampleArray1);
        System.out.println("Sorted Array 1:");
        System.out.println(Arrays.toString(exampleArray1));

        System.out.println("\nOriginal Array 2:");
        System.out.println(Arrays.toString(exampleArray2));
        Bubble_sortrtig(exampleArray2);
        System.out.println("Sorted Array 2:");
        System.out.println(Arrays.toString(exampleArray2));

        System.out.println("\nOriginal Sorted Array:");
        System.out.println(Arrays.toString(sortedArray));
        Bubble_sortrtig(sortedArray);
        System.out.println("Sorted Sorted Array:");
        System.out.println(Arrays.toString(sortedArray));
    }
    static int[] Bubble_sortrtig(int arr[]) {
        boolean swappped = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp;
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    swappped = true;
                }
            }
            if (!swappped) {
                System.out.println("Array is already sorted");
                break;
            }
        }

        return null;

    }
}