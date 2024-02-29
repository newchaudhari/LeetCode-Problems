package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/set-mismatch/description/?envType=list&envId=p227gn3t
public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }

    // First Approach, Time complexity is 754ms. Try for another approach
    public static int[] findErrorNums(int[] nums) {
        int dup = -1, missing = -1;

        for (int i = 1; i <= nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i) count++;
            }

            if (count == 2) dup = i;
            else if (count == 0) missing = i;
        }
        return new int[]{dup, missing};
    }
}
