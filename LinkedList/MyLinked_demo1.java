package JavaDSA.LinkedList;

import java.util.*;
public class MyLinked_demo1 {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<Integer>();
         l.add(20);
         l.add(10);
         l.add(40);
         l.add(30);
         l.add(50);
        System.out.println(l);
        Collections.sort(l);
        System.out.println(l);
        System.out.println(l.size());
      l.remove(1);
        System.out.println(l); 
        l.remove();  // remove first Element
        System.out.println(l);
        l.add(null);
        System.out.println(l);
        System.out.println(l.get(1));
       l.set(1, 30);
       System.out.println(l);
       System.out.println("Contains 30 : " + l.contains(30));
       System.out.println("Contains 1000 : " + l.contains(1000));
       System.out.println(" is empty : "+l.isEmpty());
       // Normal for loop 
       System.out.println("Reading objects using for loop");
       for (int i = 0; i < l.size(); i++) {
          System.out.println(l.get(i));
       }
       System.out.println("Reading objcts using for each loop");
       for (Integer x : l) {
        System.out.println(x);
        
       }

       // Iterator Method
       System.out.println("Using Iterator Method ");
       Iterator<Integer>  it = l.iterator();
       while (it.hasNext()) {
            System.out.println(it.next());
       }

    }
}
