public class factorOfNumber {
    public static void main(String[] args) {
        System.out.print("Factors of 10: ");
        factor(10);
        System.out.print("Factors of 100: ");
        factor2(100);
    }

    static void factor(int num) {
        if (num <= 0) {
            System.out.println("Number must be greater than 0");
            return;
        }

        // Collect factors and print them in a single line
        StringBuilder factors = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors.append(i).append(" ");
            }
        }
        System.out.println(factors.toString().trim());
    }

    static void factor2(int num) {
        if (num <= 0) {
            System.out.println("Number must be greater than 0");
            return;
        }

        // Collect factors and print them in a single line
        StringBuilder factors = new StringBuilder();
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                factors.append(i).append(" ");
                if (i != num / i) {  // Avoid printing the square root twice if num is a perfect square
                    factors.append(num / i).append(" ");
                }
            }
        }
        System.out.println(factors.toString().trim());
    }
}
