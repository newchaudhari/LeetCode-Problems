package arrays;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/find-the-duplicate-number/description/
public class FindDuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        System.out.println(findDuplicate3(arr));

    }

    //This code has better time complexity i.e 1ms
    public static int findDuplicate1(int[] nums) {
        boolean[] ans = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (ans[nums[i]] == true) return nums[i];
            else ans[nums[i]] = true;
        }
        return -1;
    }

    //This code has good time complexity i.e 4ms
    public static int findDuplicate2(int[] nums) {
        for (int x : nums) {
            int index = Math.abs(x);
            if (nums[index] < 0) {
                return Math.abs(x);
            }
            nums[index] = -nums[index];
        }
        return -1;
    }

    //This code has average time complexity i.e 20ms
    public static int findDuplicate3(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (set.contains(n)) {
                return n;
            }
            set.add(n);
        }
        return 0;
    }


}
