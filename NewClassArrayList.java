package JavaDSA;

import java.util.*;

 public class NewClassArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                al.add((i * 10)/2);
            } else {
                al.add(((i-1)/2) * 5 + 1);
            }
        }

        System.out.println(al);
        // sort Elements 
        System.out.println("Sorted Order");
        Collections.sort(al);
        System.out.println(al);

    }
}
