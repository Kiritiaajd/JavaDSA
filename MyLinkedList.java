import java.util.*;

public class MyLinkedList {
    public static void main(String args[]){
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(1, 15); // Adds 15 at index 1

        // Print all elements
        System.out.println("Elements in the list:");
        for (Integer item : l1) {
            System.out.println(item);
        }

        // Remove element
        l1.remove(Integer.valueOf(20)); // Removes element with value 20

        // Print size
        System.out.println("Size of the list: " + l1.size());

        // Check if list is empty
        System.out.println("Is the list empty? " + l1.isEmpty());

        // Clear the list
        l1.clear();
        System.out.println("List cleared. Is it empty now? " + l1.isEmpty()); 
    }
}
