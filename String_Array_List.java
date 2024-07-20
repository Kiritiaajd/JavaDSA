

import java.util.ArrayList;
import java.util.Arrays;

public class String_Array_List {
    public static void main(String[] args) {
        String arr[] = {"Dog " , "Car " , "Elephant"};
        for (String value : arr ) {
            System.out.println(value);
        }

        
        @SuppressWarnings({ "rawtypes", "unchecked" })
        ArrayList<String> al = new ArrayList(Arrays.asList(arr));
        System.out.println(al);
    }
}
