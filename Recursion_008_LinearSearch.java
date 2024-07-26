import java.util.ArrayList;


public class Recursion_008_LinearSearch {
    public static void main(String[] args) {
        int arr[] = { 9, 1, 4, 6, 7, 9,9 , 10  };
        System.out.println(Search(arr, 9, 0));
        System.out.println(objSearch(arr, 9, 0));
        System.out.println(objSearchLast(arr, 9, arr.length-1));
        findAllIndex(arr, 9, 0);
        System.out.println(list);
        ArrayList<Integer> result = finALLArrayList(arr, 9, 0, new ArrayList<>());
        System.out.println(result);
    }

    static boolean Search(int arr[], int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || Search(arr, target, index + 1);
    }

    static int objSearch(int arr[], int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return objSearch(arr, target, index + 1);
    }

    static int objSearchLast(int arr[], int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return objSearch(arr, target, index - 1);
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static int findAllIndex(int arr[], int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
             list.add(index);
        }
        return findAllIndex(arr, target, index + 1);
    }
   
    static ArrayList<Integer> finALLArrayList(int arr[], int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return finALLArrayList(arr, target, index + 1, list); // Pass the list to the next recursive call
    }
}
