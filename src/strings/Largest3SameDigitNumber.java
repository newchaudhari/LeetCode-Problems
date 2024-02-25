package strings;

// https://leetcode.com/problems/largest-3-same-digit-number-in-string/description/
public class Largest3SameDigitNumber {
    public static void main(String[] args) {
        String num = "222";
        System.out.println(largestGoodInteger(num));

    }

    // First Approach, Time Complexity is 6ms
    public static String largestGoodInteger(String num) {
        //It uses a flag check to verify if the condition of finding the triplet is met.
        //The temp variable stores the largest digit found within the triplet.
        //If a triplet is found (check == false), the largest digit is appended three times to the ans string.
        //If no triplet is found, it returns an empty string.
        //The main function demonstrates how to use this method by providing an example input string
        // and displaying the largest good integer found in it.
        String ans = ""; // Initialize an empty string to store the result
        String empty = ""; // Initialize an empty string for a special case
        int temp = 0; // Initialize a variable to store the largest digit found
        boolean check = true; // Initialize a flag to check for a specific condition

        // Loop through the string to find the largest digit occurring thrice consecutively
        for (int i = 0; i < num.length() - 2; i++) {
            // Check if the current digit is the same as the next two digits
            if (i + 2 < num.length() && num.charAt(i) == num.charAt(i + 1) && num.charAt(i) == num.charAt(i + 2)) {
                // Convert the character digit to its integer equivalent and update 'temp'
                temp = Math.max(temp, num.charAt(i) - '0');
                check = false; // Update the flag to indicate the condition was met
            }
        }

        // If the condition was met (i.e., a triplet was found)
        if (!check) {
            // Append the largest digit found three times to the 'ans' string
            for (int i = 0; i < 3; i++) {
                ans += temp;
            }
        } else { // If no such triplet found
            return empty; // Return the empty string
        }

        return ans; // Return the result containing the largest good integer
    }

    // Second Approach, Time Complexity is
    public static String largestGoodInteger2(String num) {
        int result = -1;
        for (int i = 999; i >= 111; i -= 111) {
            if (num.contains(String.valueOf(i))) {
                result = i;
                return String.valueOf(result);
            }
        }
        if (num.contains("000")) return "000";
        return "";

    }

}
