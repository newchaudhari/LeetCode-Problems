package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }

    public static int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        Set<Integer> hashset = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashset.contains(nums[i])) {
                ans[0] = nums[i - 1];
                ans[1] = nums[i] + 1;
            }
            hashset.add(nums[i]);
        }
        return ans;
    }
}
