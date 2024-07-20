import java.util.ArrayList;
public class pretty_printing {
    public static void main(String[] args) {
        float f = 432.4899f;
        System.out.printf("%.2f\n" ,f );
        System.out.println('a' + 'b');
        //195 (ASCII Value)
        System.out.println("a" +"b"); 
        //ab
        System.out.println((char)('a' +1)); 
        //b -->  here charater is added 
        //to the integer and typecasted to the char in
        // give the ouput as char with its incremented value 
        
        System.out.println(('a' +1)); 
        // 98 --> if character is added to the integer without typecasted 
         
        System.out.println("a" +1); // same as "a" + "1"
        // a1 --> when string is concatenated with  the integer 
        // it is converted to its wrapper class (.toString());
            
        System.out.println("Kiriti" + new ArrayList<>());
        System.out.println("Kiriti"+ new Integer(56) + new ArrayList<>());
    }
}
