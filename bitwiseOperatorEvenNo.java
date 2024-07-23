public class bitwiseOperatorEvenNo {
    public static void main(String[] args) {
              int num = 98;
              System.out.println(IsOdd(num));
    }

    static boolean IsOdd(int n) {
        return (n & 1) == 1;
    }
}
