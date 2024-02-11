package arrays;

//https://leetcode.com/problems/sort-array-by-parity/description/

import java.util.Arrays;

public class SortArrayByParity {
    public static void main(String[] args) {
        int[] array = {3, 1, 2, 4};
        System.out.println(Arrays.toString(sortArrayByParity2(array)));

    }

    // First Approach using bubble sort, Time complexity is 113ms
    public static int[] sortArrayByParity(int[] nums) {
        boolean swapped;
        for (int i = 0; i < nums.length; i++) {
            swapped = false;
            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j] % 2 == 0) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        return nums;
    }

    // Second approach, Time Complexity is 0ms
    public static int[] sortArrayByParity2(int[] nums) {
        int j = 0, temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        return nums;
    }
}
