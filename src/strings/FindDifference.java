package strings;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/find-the-difference/description/

public class FindDifference {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        System.out.println(findTheDifference2(s,t));


    }

    // First approach that made but not works
    public char findTheDifference(String s, String t) {
        Set<Character> set = uniqueSet(s.toCharArray());
        char[] t1 = t.toCharArray();
        for (int i = 0; i < t1.length; i++) if (!set.contains(t1[i])) return t1[i];
        return t1[0];
    }

    public Set<Character> uniqueSet(char[] s) {
        Set<Character> hashSet = new HashSet<>();
        for (int i = 0; i < s.length; i++) hashSet.add(s[i]);
        return hashSet;
    }

    // Second approach that uses XOR operator that has 1ms time complexity
    public static char findTheDifference2(String s, String t) {
        char c = 0;
        for (char cs : s.toCharArray()) c ^= cs;
        for (char ct : t.toCharArray()) c ^= ct;
        return c;
    }
}
