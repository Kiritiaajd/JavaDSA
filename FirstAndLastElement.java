
import java.util.*;
public class FirstAndLastElement{
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 3, 4,4,5,6,7,7,8,8,9};
		int target = 6;
	
		System.out.println(Arrays.toString(ElementIndex(arr, target)));
	}
static int search(int arr[] , int target , boolean findstartIndex) {
		  int ans = -1;
			int start = 0; 
			int end = arr.length-1;
			while(start <= end) {
				int mid  = start + (end -start)/2;
				
				if(target < arr[mid]) {
					end = mid-1;
					
				}else if(target > arr[mid]) {
					start  = mid +1;
					
				}else {
					ans = mid;
					    if(findstartIndex) {
					    	end = mid -1;
					    }else {
							start = mid +1;
			     	}
				}
				
			}
			
			return ans;
	  }
	public static int[] ElementIndex(int []arr , int target) {
		int ans[]= {-1 , -1};
		int start = search(arr,target , true );
		int end = search(arr , target , false);
		
		ans[0] = start;
		ans[1] = end;
		return ans;
	}
}