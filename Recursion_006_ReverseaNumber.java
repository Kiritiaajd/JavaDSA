public class Recursion_006_ReverseaNumber {
    public static void main(String[] args) {
        System.out.println(reverse(198, 0));
    }


    static int reverse(int n, int rev) { 
        // Helper method to reverse the number
        if (n == 0) {
            return rev;
        }
        int rem = n % 10;
        rev = rev * 10 + rem;
        return reverse(n / 10, rev);
    }
}
