//https://leetcode.com/problems/richest-customer-wealth/description/

public class RichestCoustomer {
    public static void main(String[] args) {
         int arr[][] = {{1,2 } ,{ 1,2,3} , {0, 0 , 0} , {4, 1,2 ,3}};
         System.out.println("Richest person have wealth : "+ maximumWealth(arr));
    }

    static int maximumWealth(int[][] accounts) {
        int richest =0;
       
        int curr_sum=0;
               for (int i = 0; i < accounts.length; i++) {
                for (int j = 0; j < accounts[i].length; j++) {
                     curr_sum = curr_sum + accounts[i][j];
                }
                if (curr_sum > richest) {
                    richest = curr_sum;

                }
                curr_sum =0;
               }
        return richest;
    }
}
