package JavaDSA;

import java.util.ArrayList;
import java.util.Arrays;

public class String_Arra_List {
    public static void main(String[] args) {
        String arr[] = {"Dog " , "Car " , "Elephant"};
        for (String value : arr ) {
            System.out.println(value);
        }

        
        ArrayList<String> al = new ArrayList(Arrays.asList(arr));
        System.out.println(al);
    }
}
