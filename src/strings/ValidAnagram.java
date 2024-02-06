package strings;

import java.util.Arrays;

//https://leetcode.com/problems/valid-anagram/description/

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        System.out.println(validAnagram(s, t));
    }

    // First Approach, Time Complexity is 3ms. Look for another approach
    public static boolean validAnagram(String s, String t) {
        char[] charArray1 = s.toCharArray();
        char[] charArray2 = t.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        for (int i = 0; i < charArray1.length; i++) {
            if (charArray1[i] != charArray2[i]) {
                return false;
            }
        }
        return true;
    }
}
