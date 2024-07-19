
public class infiniteArray {
public static void main(String [] args) {
	  
	int arr[]= {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 , 16, 17,18 , 19 , 20 , 21 ,22, 23, 24 ,25, 26 ,27, 28 };
	     int target = 10;
	     System.out.println(findinrange(arr , target));
  }
 public static int BinarySearch(int arr[] , int target , int start , int end) {
	 while(start <=end) {
		 int mid = start + (end - start)/2;
		 if(target  < arr[mid]) {
			 end = mid-1;
		 }else if(target > arr[mid]) {
			 start = mid +1;
		 }else {
			 return mid;
		 }
	 }
	return -1;
 }
public static  int findinrange(int arr[] , int target) {
	int index=0;
	int start = 0;
	int end = 2;
	while(target > arr[end]) {
		int new_start = end +1;
		end = end +(end - start +1)*2; 
		start = new_start;
	}
	
	return BinarySearch(arr , target , start , end);
}
}
