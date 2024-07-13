import java.util.Arrays;

public class linearSearch {

    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 2, 6, 5, 7, 4, 6 };
        int target = 4;
        System.out.println(target + " is at index :" + Searching(arr, target));

        String[] arr1 = { "Aman", " Raju", " Shyam", "A", "b" };
        String[] arr3 = new String[5];
        String target2 = "aman";

        System.out.println(SearchString(arr1, target2)); // false
        System.out.println(SearchString(arr3, target2)); // false
        System.out.println(SearchInRange(arr, target, 0, 3));
        System.out.println("Minimum number of array is : " + minNumber(arr));

        /////////////////////////////////////////

        int[][] arr2 = { { 1, 2, 3 },
                         { -1, 2, -4 , 7},
                         { -9, 4, 5  , 8 },
                         { 7, 9, 0 } };

                         print2darray(arr2);
        int[] res = search2Darray(arr2, target);
        System.out.println(Arrays.toString(res));

        System.out.println("Minimum in 2d array :"+searchMin(arr2));
    }
    static int searchMin(int[][] arr) {
        int min = arr[0][0]; // Initialize min with the first element of the array
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }
        
        return min;
    }
      static void print2darray(int [][]arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
      }
    static int[] search2Darray(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    static int minNumber(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    static boolean SearchInRange(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return false;
        }
        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }

    static boolean SearchString(String[] arr, String target) {
        if (arr.length == 0) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (target.equalsIgnoreCase(arr[i])) {
                return true;
            }
        }
        return false;
    }

    static int Searching(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
