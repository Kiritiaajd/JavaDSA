//  Permutations and combinations 
// Subsets - > No Adjacaent Collection 
// [3 ,5 ,9] -> [3] , [3,5] , [3,9] , [3,5,9] , [5 ,9] , [5] , [9]
// We are going to solve this by resursion and Iteration 



public class Recursion_013subset {
    public static void main(String[] args) {
           String   str  = "abc";
           subsetR("", str);

    }

   static void subsetR(String p , String up){
       
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        subsetR(p + ch , up.substring(1));
        subsetR(p, up.substring(1));

    }
}
