   

class SearchAndSorting {
    public int arr[] ;

    public int SearchIndex( int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (target < arr[mid]) {
                end = mid - 1;
            }
           else{
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
   private  void swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;
   }
     public void BubbleSort( int arr[]){
           for (int i = 1; i < arr.length -1; i++) {
                if (arr[i] > arr[i+1]) {
                      swap(arr[i]  , arr[i+1]);
                }
           }
     }
    
 }

 /**
  * Display
  */
class Display extends SearchAndSorting   {
 
    
 }
public class BinarySearchPractice {
    public static void main(String[] args) {
        int arr[] = { 1, 29, 5, 60, 7, 8, 9, 10 };
        Sorting sort  = new Sorting();
        sort.BubbleSort(arr);
        SearchAndSorting s = new SearchAndSorting();
        s.arr = arr;
        int index = s.SearchIndex( 10);
         
        if (index == -1) {
            System.err.println("Element not found");
        } else {
            System.out.println("Element found at index " + index);
        }

    }

}
