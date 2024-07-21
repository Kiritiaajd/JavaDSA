public class Recursion_002_Fibbonacci {
    public static void main(String[] args) {
           System.out.println(fibbo(7));
    }
    static int fibbo(int n){

        if (n<2) {
            return n;
            
        }
       return fibbo(n-1) +fibbo(n-2);
        }
    }

