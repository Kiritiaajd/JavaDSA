import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Kiritiaajad Rajdheer"; //20
        System.out.println(name.length()); //[K, i, r, i, t, i, a, a, j, a, d,  , R, a, j, d, h, e, e, r]
        System.out.println(Arrays.toString(name.toCharArray())); // kiriti
        System.out.println(name.toLowerCase() ); //kiritiaajad rajdheer
        System.out.println(name.indexOf('i')); // 1
        System.out.println(Arrays.toString(name.split(""))); // [K, i, r, i, t, i, a, a, j, a, d,  , R, a, j, d, h, e, e, r]
        System.out.println("  kiriti   ".strip()); //kiriti
    }
}
