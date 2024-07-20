import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDuplicatesNumber {
    public static void main(String[] args) {
           int arr[] = {4,3,2,7,8,2,3,1};
           List<Integer> ls  = new ArrayList<Integer>();
           CycleSort(arr);
           System.out.println(Arrays.toString(arr));
           for (int i = 0; i < arr.length; i++) {
                if (arr[i]!= i+1 && !ls.contains(arr[i])) {
                    ls.add(arr[i]);
                }
           }

           System.out.println(ls);
    }

    static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void CycleSort(int arr[]) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }
}
