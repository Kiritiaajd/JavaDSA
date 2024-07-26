public class NewtonRaphsonMethod {
    public static void main(String[] args) {
        System.out.printf("%.10f\n", squareRoot(10)); 
    }

    static double squareRoot(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Cannot compute the square root of a negative number.");
        }

        double x = n;
        double root;
        double precision = 1e-10; // More accurate convergence threshold

        while (true) {
            root = 0.5 * (x + n / x);
            if (Math.abs(root - x) < precision) {
                break;
            }
            x = root;
        }
        return root;
    }
}
