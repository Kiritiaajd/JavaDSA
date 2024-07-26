public class SquareRoot {
    public static void main(String[] args) {
        System.out.printf("%.3f\n", Root(121, 2));
    }
  // time Cpmplexity = O(log(n))
    static double Root(int num , int p) {
        int start = 0;
        int end = num;
        double root = 0.0;
        while (start <= end) {
            int mid = start+ (end - start) / 2;
            if (mid * mid == num) {
                return mid;
            } 

            if (mid * mid > num) {
                end = mid -1;
            }else{
                start = mid +1;
                root = mid;
            }
        }
        double increment = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root  <= num) {
                root += increment;
            }
            root-=increment;
           increment = increment/10;
        }

        return root;
    }
}
