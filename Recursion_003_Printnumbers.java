public class Recursion_003_Printnumbers {
    public static void main(String[] args) {
        fun(5);
    }

    static void fun(int num) {
        if (num == 0) {
            return;
        }
        fun(num - 1);
        System.out.println(num); 

    }
}
