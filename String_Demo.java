public class String_Demo {
    public static void main(String[] args) {
        String name1 = "Kiriti";
        String name2 = "Kiriti";
        System.out.println(name1 == name2); // true 
        // Because here both string name1 and name2 pointing to the same kiriti which is created in pool 
        //and so this is giving the value true
        
        String name3 = new String("Kiriti");
        String name4 = new String("Kiriti");
        System.out.println(name3 == name4);  // false
        // it gives false  because here we are creating the new 
        // two new String objects which is pointing to two other objects
         
        //  on the above "==" are comparators which compares both values and reference wheather 
        // the both String variable pointing at same value in pool

        // Now we are going to check  only values that the values of both string are equal or not .
        // for checking this we are going to use the .equals() method.

        System.out.println(name3.equals(name4)); // true
        System.out.println(name1.equals(name2)); // true
        System.out.println(name1.equals(name4)); // true 
         // here all outputs are true because the  values of all four string are same
         
    }
}
