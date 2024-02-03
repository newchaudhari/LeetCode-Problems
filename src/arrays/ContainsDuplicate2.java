package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/contains-duplicate-ii/description/?envType=list&envId=pi8tk6d3

public class ContainsDuplicate2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 1, 2, 3};
        int k = 2;
        System.out.println(containsDuplicate(array, k));
    }

    public static boolean containsDuplicate(int[] nums, int k) {
        //First Approach

//        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 1; j < nums.length-1; j++) {
                int diff=j-i;
                if (nums[i] == nums[j] && diff <= k) {
                    return true;
                }
            }
        }
        return false;
    }
}
