package jasmin;

public class ReverseString {
    public static void main(String[] args) {

        String s = "Bangladesh";
        String r = "";
        char c;
        for (int i = 0; i < s.length(); i++) {

            // extracts each character
            c = s.charAt(i);
            // adds each character in
            // front of the existing string
            r = c + r;
        }

        System.out.println(r);
    }
}

