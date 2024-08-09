public class Recursion_011String {
    public static void main(String[] args) {
        String str = "badfvbappleabfn";

        System.out.println(Substring(str, "", 0));

        skip("", str);

        System.out.println(skip1(str));

        System.out.println(skipapple(str));
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

    static void skip(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        if (ch == 'a') {
            skip(p, up.substring(1));

        } else {
            skip(p + ch, up.substring(1));
        }
    }

    static String skip1(String up) {
        if (up.isEmpty()) {
            return "";
        }

        char ch = up.charAt(0);
        if (ch == 'a') {
            return skip1(up.substring(1));

        } else {
            return ch + skip1(up.substring(1));
        }
    }

    static  String skipapple(String up){

        if (up.isEmpty()) {
            return "";
        }
            if (up.startsWith("apple")) {
                return skipapple(up.substring(5));
            }
            else{
                return  up.charAt(0) + skipapple(up.substring(1));
            }
    }
}
