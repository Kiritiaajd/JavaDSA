public class NumberoFDigits {
    public static void main(String[] args) {
            int num = 123456;
            int b = 10;// counnt number is Decimal
            int b1 = 2; // count the numbwe in binary 
             int ans = (int)(Math.log(num)/Math.log(b)) + 1;
             int ans2 = (int)(Math.log(num)/Math.log(b1)) + 1;
             System.out.println(ans);
             System.out.println(ans2); 
    }

}