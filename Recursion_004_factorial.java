public class Recursion_004_factorial {
    public static void main(String[] args) {
        System.out.println( factorial(10));
    }

    static int factorial(int n) {
       
        if (n == 0) {
            return 1;
        }
        return  factorial(n-1) * n;
    }
}
