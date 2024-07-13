import java.util.LinkedList;

public class queueDemo01_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> ls = new LinkedList<>();

        // Insertion order preserved 
        // Duplicates are allowed 
        // heterogeneous data allowed 
        ls.add("A");
        ls.add("A");
        ls.add("B");
        ls.add("C");
        ls.add("D");
        System.out.println(ls);
        System.out.println(ls.remove());
        System.out.println(ls.remove());
        System.out.println(ls.remove());
        System.out.println(ls.remove());
        System.out.println(ls.remove());
      //  System.out.println(ls.remove()); 
      // return Exception
      System.out.println(ls.poll()); //return null
      System.out.println(ls.peek()); // return null
      



    }  
}
