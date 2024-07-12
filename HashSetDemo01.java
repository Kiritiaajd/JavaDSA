
import java.util.*;

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
        System.out.println("contained AMAN "+hs.contains("AMAN"));
        System.out.println("isEmpty "+hs.isEmpty());
        System.out.println("read usin for eah (not access by for loop) : ");
        for (Object object : hs) {
            System.out.print(""+object+" ");
        }
        System.out.println("using iterator ");
        @SuppressWarnings("rawtypes")
        Iterator it = hs.iterator();
        while (it.hasNext()) {
            System.out.print(it.next()+"  ");
        }

    }
}
