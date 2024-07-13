// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

public class EvenNoOfDigits {
    public static void main(String[] args) {
               
             int nums[] = {12,345,2,6,7896 ,  -1234 , 0 };
                 System.out.println( "total No. are : "+findNumbers(nums));
    }

    static int findNumbers(int[] nums) {

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (digits(nums[i])) {
                count++;
            }
        }

        return count;
    }

    private static boolean digits(int num) {
        int count = 0;
              if (num < 0) {
                num = num * -1;
              }
        if (num ==0 ) {
            return false;
        }
        while (num > 0) {
            count++;
            num = num / 10;

        }

        return count % 2 == 0;
    }
}
