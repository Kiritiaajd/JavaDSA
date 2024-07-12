package JavaDSA;
 import java.util.*;
public class Array_List {
    /**
     * @param args
     */
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // Declare ArrayList
        @SuppressWarnings("rawtypes")
        ArrayList al = new ArrayList<>();

        al.add(100);
        al.add("Welcome");
        al.add(19.9);
        al.add('A');
        al.add(true);
        System.out.println("Number of Elements in Array List is : "+al.size());
       System.out.println(al);
       al.remove(0); // here 1 is the index
       System.out.println(al);
       al.add(2, "Collections");
       System.out.println(al);

       // retrive specific Element 
       System.out.println(al.get(1));

       // replace Element //
       al.set(1, "AMAN");
       System.out.println(al);
       al.set(3 , 100);

       // search a value 
      System.out.println( al.contains(100));

      // isEmpty()
      System.out.println(al.isEmpty());
      al.removeAll(al);
      System.out.println(al.isEmpty());

     for(int i = 0 ; i < 10 ; i++){
        al.add(i*10);
     }


     // 1) For loop 
     System.out.println("Using for Loop ");
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i)+ " ");
        }
          System.out.println();
        // for Ecah LOOP 
        System.out.println("Using for Each loop ");
        for (Object e : al) {
            System.out.print(e+" ");
        }
               System.out.println();
 
        // Iterator 
        System.out.println("Usig Iterator");
        @SuppressWarnings("rawtypes")
        Iterator it = al.iterator();
        while (it.hasNext()) {
            System.out.print(it.next()+ " ");
        }


    }
}
