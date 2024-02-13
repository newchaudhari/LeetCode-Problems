package strings;

//https://leetcode.com/problems/find-first-palindromic-string-in-the-array/description/

public class FirstPalindromicStringInArray {
    public static void main(String[] args) {
        String[] words = {"abc", "car", "ada", "racecar", "cool"};
        System.out.println(firstPalindrome(words));

    }

    // First Approach, Time Complexity is 4ms
    public static String firstPalindrome(String[] words) {
        for (String word : words) {
            //convert string into string builder to reverse string
            StringBuilder sb = new StringBuilder(word);
            //check if reverse strings is equal to original string
            if (sb.reverse().toString().equals(word)) return word;
        }
        return "";
    }

    // Second Approach using two pointers and using charAt to check start and end letter
    public static String firstPalindrome2(String[] words) {
        // write code here
        return "";
    }
}
