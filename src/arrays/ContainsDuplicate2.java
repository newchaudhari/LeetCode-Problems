package arrays;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate2 {
    public static void main(String[] args) {
        int[] array = {1,2,3,1};
        int k = 3;
        System.out.println(containsDuplicate(array, k));
    }

    public static boolean containsDuplicate(int[] nums, int k) {
        //First Approach

//        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = nums.length - 1; j > i; j--) {
                int diff=j-i;
                if (nums[i] == nums[j] && j - i <= k) {
                    return true;
                }

            }
        }
        return false;


    }
}
