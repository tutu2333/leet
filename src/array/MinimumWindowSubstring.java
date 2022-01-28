package array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MinimumWindowSubstring {

    public String minWindow(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }

        int left = 0;
        String ans = "";
        Counter tCharCounter = new Counter();
        Counter sCharCounter = new Counter();
        for (char c : t.toCharArray()) {
            tCharCounter.add(c);
        }


        for (int right = 0; right < s.length(); right++) {
            char cur = s.charAt(right);
            if (!tCharCounter.containsKey(cur)) {
                continue;
            }
            sCharCounter.add(cur);
            if (!sCharCounter.containCounter(tCharCounter)) {
                continue;
            }
            while (sCharCounter.containCounter(tCharCounter)) {
                sCharCounter.minus(s.charAt(left));
                left++;
            }
            if ("".equals(ans) || ans.length() > right - left + 2) {
                ans = s.substring(left - 1, right + 1);
            }

        }
        return ans;
    }


    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        MinimumWindowSubstring minimumWindowSubstring = new MinimumWindowSubstring();
        System.out.println(minimumWindowSubstring.minWindow(s, t));
    }
}


class Counter extends HashMap<Character, Integer> {
    public int getCount(Character character) {
        return getOrDefault(character, 0);
    }

    public void add(Character character) {
        put(character, getCount(character) + 1);
    }

    public void minus(Character character) {
        if (!keySet().contains(character)) {
            return;
        }
        if (getCount(character) < 2) {
            remove(character);
            return;
        }
        put(character, getCount(character) - 1);
    }

    public boolean containCounter(Counter other) {
        for (Character c : other.keySet()) {
            if (getCount(c) < other.getCount(c)) {
                return false;
            }
        }
        return true;
    }
}