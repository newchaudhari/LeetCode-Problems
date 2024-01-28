package arrays;

import java.util.Arrays;
//https://leetcode.com/problems/running-sum-of-1d-array/description/
public class RunningSumOfArray {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 10, 1};
        System.out.println(Arrays.toString(runningSum(arr)));

    }

    public static int[] runningSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            nums[i] = sum;
        }
        return nums;
    }
}
