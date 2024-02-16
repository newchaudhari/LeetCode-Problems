package strings;

public class IsSubsequence {
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s, t));

    }

    // First Approach Time complexity is 2ms
    public static boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }

    // First Approach Time complexity is 1ms, try for another approach
    public static boolean isSubsequence2(String s, String t) {
        if (s.isEmpty()) return true;
        int n = 0;
        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(n) == t.charAt(i)) {
                n++;
                if (n == s.length()) return true;
            }
        }
        return false;
    }
}
