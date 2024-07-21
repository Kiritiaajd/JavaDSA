public class Recursion_001 {
    public static void main(String[] args) {
      // Write a function that prints hello World
      message(10);
    }
    static int message( int n){
        System.out.println(n+" Hello World");
      return n = n > 1 ? message(n-1) : n;
    }
}
