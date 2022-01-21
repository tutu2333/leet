package array;

import java.util.Arrays;

public class BackspaceStringCompare {

    public boolean backspaceCompare(String s, String t) {
        String s1 = removeBackspace(s);
        String t1 = removeBackspace(t);

        return s1.equals(t1);

    }

    private String removeBackspace(String old) {
        int slow = 0;
        int fast = 0;
        int len = old.length();
        char[] chars = old.toCharArray();
        while (fast < len) {
            if (old.charAt(fast) != '#') {
                chars[slow++] = chars[fast];
            } else {
                slow = slow > 0 ? slow - 1 : 0;
            }
            fast++;
        }
        if (slow < 1) {
            return "";
        }

        return String.valueOf(chars).substring(0, slow);
    }

    public static void main(String[] args) {
        BackspaceStringCompare bs = new BackspaceStringCompare();
        System.out.println(bs.removeBackspace("a#c"));
    }

}
