package arrays;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 1};
        System.out.println(containsDuplicate(array));
    }

    public static boolean containsDuplicate(int[] nums) {
        //First Approach

        /*Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;*/

        //Second Approach
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)){
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}
