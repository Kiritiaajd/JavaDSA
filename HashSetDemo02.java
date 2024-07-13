import java.util.HashSet;

public class HashSetDemo02 {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
           set1.add(1);
           set1.add(2);
           set1.add(3);
           set1.add(4);
           System.out.println("HashSet1 \n"+set1);
           HashSet<Integer> set2 = new HashSet<>();
           set2.add(4);
           set2.add(5);
           set2.add(2);

          /* System.out.println("Using addAll we can find union");
           set1.addAll(set2);
           System.out.println(set1);
           
           output:
           HashSet1 :[1, 2, 3, 4]
            Using addAll we can find union
             [1, 2, 3, 4, 5] */

          /* System.out.println("Using retainAll we can find Intersection :");
           set1.retainAll(set2);
           System.out.println(set1);
           Using retainAll we can find Intersection :
           [2, 4, 5]
           */ 

           //subset
           System.out.println("Using contains all we can find subset");
           
           System.out.println(set1.containsAll(set2));
    }
}
