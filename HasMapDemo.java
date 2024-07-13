import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class HasMapDemo {
    public static void main(String[] args) {
        HashMap<Integer , String> hs = new HashMap<>();
        hs.put(101, "John");
        hs.put(102, "Aman");
        hs.put(103, "Mary");
        hs.put(104, "David");
        hs.put(105, "Tye");
        hs.put(106, "Raju");
        System.out.println(hs); // {101=John, 102=Aman, 103=Mary, 104=David, 105=Tye, 106=Raju}

        System.out.println(hs.get(101)); // John
        hs.remove(106); // 106 is removed from hashMap
        System.out.println(hs); // {101=John, 102=Aman, 103=Mary, 104=David, 105=Tye} 
        System.out.println(hs.containsKey(105)); // true
        System.out.println(hs.containsKey(106)); // false
    
         System.out.println(hs.containsValue("John")); // true
         System.out.println(hs.isEmpty()); // false
          
         System.out.println(hs.keySet()); // [101, 102, 103, 104, 105] (These return as a set "Duplicates Not allowed")
         System.out.println(hs.values()); // [John, Aman, Mary, David, Tye]   (these return as a collections) "Duplicates are allowed"

         System.out.println(hs.entrySet()); //[101=John, 102=Aman, 103=Mary, 104=David, 105=Tye] 

         // read ecah Individual Value 
         for ( Integer i: hs.keySet() ){
            System.out.print(i+" ");
         } // return al keys 
         System.out.println("");
         for ( String i: hs.values() ){
            System.out.print(i+" ");
         } // return all values 

         for (Integer integer : hs.keySet()) {
            System.out.println(integer+"  "+hs.get(integer));
         }/*
         Output
         102  Aman
         103  Mary
         104  David
         105  Tye */

         // Enter Interface methods
         for(Entry<Integer, String> entry : hs.entrySet()){
            System.out.println(entry.getKey() + "  "+entry.getValue());
         }
         /*
          * 101  John
            102  Aman
            103  Mary
            104  David
            105  Tye
          */
               
    }
}
