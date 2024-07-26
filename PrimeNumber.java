public class PrimeNumber {
    public static void main(String[] args) {
        int n = 59;

        // Display prime numbers till n
        boolean[] prime = new boolean[n + 1];
        seive(n, prime);
    }

    static void seive(int num, boolean[] prime) {
        // Mark all numbers as prime initially
        for (int i = 2; i <= num; i++) {
            prime[i] = true;
        }

        // Implement the Sieve of Eratosthenes algorithm
        for (int i = 2; i * i <= num; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= num; j += i) {
                    prime[j] = false;
                }
            }
        }

        // Print all prime numbers
        for (int i = 2; i <= num; i++) {
            if (prime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
