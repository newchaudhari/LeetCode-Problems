package arrays;

// https://leetcode.com/problems/monotonic-array/description/

public class MonotonicArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3};
        System.out.println(isMonotonic(nums));

    }

    // First Approach, time complexity is 3ms. Look for another approach
    public static boolean isMonotonic(int[] nums) {
        boolean increasing = true;
        boolean decreasing = true;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < nums[i]) decreasing = false;
            else if (nums[i - 1] > nums[i]) increasing = false;
        }
        return increasing || decreasing;
    }
}
