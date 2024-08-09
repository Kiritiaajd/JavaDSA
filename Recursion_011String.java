public class Recursion_011String {
    public static void main(String[] args) {
           String str = "baaadfvb aaaaabffnn";
           
           System.out.println(Substring(str, "", 0));
    }

    static String Substring(String str, String ans, int index) {
        if (index == str.length()) {
            return ans;
        }    

        if (str.charAt(index) != 'a') {
            ans = ans + str.charAt(index);
            return Substring(str, ans, index + 1);
        } else {
            return Substring(str, ans, index + 1);
        }

    }

    
}
