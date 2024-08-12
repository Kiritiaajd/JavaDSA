public class BinarySearchPracticeRecursion {
    public static void main(String[] args) {
         int arr[] =  { 1,2,3,4,5,6,7,8,9,10};
         int result = BinarySearch(arr, 0, arr.length, 9);
         System.out.println("Target is at index " + result);
    }

    static int BinarySearch( int[] arr , int start , int end , int target ){
       if (start > end ) {
          return -1;
       }
        int mid = start + (end- start)/2;
          if (arr[mid] == target ) {
             return mid;
          }
          
          if (target < arr[mid]) {
          return  BinarySearch(arr, start, mid -1, target);
          }
          else{
           return  BinarySearch(arr, mid + 1, end, target);
          }
          
    }
}
