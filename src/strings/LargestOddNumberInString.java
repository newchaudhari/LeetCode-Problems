package strings;

//https://leetcode.com/problems/largest-odd-number-in-string/description/

public class LargestOddNumberInString {
    public static void main(String[] args) {
        String num = "35427";
        System.out.println(largestOddNumber(num));
    }

    // First approach and time complexity is 1ms And beat 100% users
    public static String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            if (num.charAt(i) % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }
}
