

import java.util.Collections;
import java.util.LinkedList;

public class MyLinked_demo2 {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>();
        l.add("A");
        l.add("B");
        l.add("C");
        l.add("D");
        l.add("E");

        LinkedList<String> new_l = new LinkedList<>();
        new_l.add("A");
        new_l.addAll(l);
        System.out.println(new_l);
      //  new_l.removeAll(new_l);
      //  System.out.println(l);
        // Outpu
     //   A, A, B, C, D, E]
      //  [A, B, C, D, E]
         l.removeAll(l);
         System.out.println(new_l);
         System.out.println("Suffle Method");
         Collections.shuffle(new_l);
         System.out.println(new_l);
         System.out.println("Sorting method");
         Collections.sort(new_l);
         System.out.println(new_l);
         System.out.println("reverse order");
         Collections.sort(new_l.reversed());
         System.out.println(new_l);
         
    }
}
