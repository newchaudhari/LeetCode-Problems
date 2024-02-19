package strings;

//https://leetcode.com/problems/number-of-segments-in-a-string/description/

public class NumberOfSegmentsInString {
    public static void main(String[] args) {
        String s = ", , , ,        a, eaefa";
        System.out.println(countSegments2(s));

    }

    // First approach, time complexity is 0ms
    public static int countSegments(String s) {
        // Split the string into words using spaces as separators
        String[] words = s.split(" ");
        int count = 0;

        // Count non-empty words
        for (String word : words) {
            if (!word.isEmpty()) {
                count++;
            }
        }
        return count;
    }

    // Second approach and time complexity is 0ms
    public static int countSegments2(String s) {
        int count = 0;
        boolean inSegment = false;

        // Iterate through the characters in the string
        for (char c : s.toCharArray()) {
            if (c != ' ') {
                // If the character is not a space, we are in a segment
                if (!inSegment) {
                    inSegment = true;
                    count++;
                }
            } else {
                // If the character is a space, we are not in a segment
                inSegment = false;
            }
        }
        return count;
    }
}
