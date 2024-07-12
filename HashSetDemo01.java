
import java.util.*;

@SuppressWarnings("unused")
public class HashSetDemo01 {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // HashSet<Integer> hs = new HashSet<>();
        // @SuppressWarnings("rawtypes")
        // HashSet<Integer> hs = new HashSet(100);
        @SuppressWarnings("rawtypes")
        HashSet hs = new HashSet<>();
        hs.add(100);
        hs.add("AMAN");
        hs.add(90.09);
        hs.add(true);
        hs.add(null);
        System.out.println(hs);
        hs.remove(100);
        System.out.println(hs);
    }
}
