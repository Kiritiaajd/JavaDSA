public class Recursion_007_sortedArray {

    public static void main(String[] args) {
        int arr[] = { 1, 4, 6, 7, 9, 10 };
        System.out.println(check(arr, 0));
    }

    static boolean check(int arr[], int n) {
        if (n == arr.length -1) {
            return true;
        }

        return (arr[n] < arr[n + 1]) && check(arr, n + 1);
    }
}
