public class Recursion_005_sumofDigits {
    public static void main(String[] args) {
      System.out.println(  Digitsum(1567)) ;
    }
    static int Digitsum(int n){
       int rem = 0;
       if (n ==0) {
        return 0;
       }
       rem = n %10;
       return  rem +Digitsum(n/10);
    }
}
