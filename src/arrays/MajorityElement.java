package arrays;

import java.util.Arrays;
//https://leetcode.com/problems/majority-element/description/
public class MajorityElement {
    public static void main(String[] args) {
        int[] array = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(array));

    }

    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length/2;
        return nums[n];

    }
}
