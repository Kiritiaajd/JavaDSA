import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Example {
    public static void main(String[] args) {
        HashMap<String, Integer> hs = new HashMap<>();
        hs.put("one", 1);
        hs.put("two", 2);
        hs.put("three", 3);
        hs.put("three", 3); // not implemented due to duplicate key
        // hs.put(null, "4"); // retrns null pointer exception
        // hs.put("four", null); null value Exception
        System.out.println(hs.get("one"));
        System.out.println(hs);
        System.out.println(hs.containsKey("one"));// true
        System.out.println(hs.containsValue(3));// true
        System.out.println(hs.keySet());// return all keys
        System.out.println(hs.values());// return all values as a collection
        for (String k : hs.keySet()) {
            System.out.println(k+"  "+ hs.get(k));
        }

        // entry specific method 
        Set<Map.Entry<String, Integer>> s = hs.entrySet();
        Iterator<Map.Entry<String, Integer>> itr = s.iterator();

        while (itr.hasNext()) {
            Map.Entry<String, Integer> entry = itr.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
