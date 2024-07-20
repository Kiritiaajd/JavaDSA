
public class StringBuilder1 {

    public static void main(String[] args) {
       // String series = "";
     
         StringBuilder build = new StringBuilder();
        for (int i = 0; i < 26; i++) {
         char ch = (char)('a'+i);
        //  series = series +ch; // here so many wastage of space 
          // a , ab , abc , abcd ...... all has no reference .
              // but ..
              build.append(ch); // here is no memory wastage happen
        }

        System.out.println(build.toString()); 

    }
  
}
