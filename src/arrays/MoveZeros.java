package arrays;

//https://leetcode.com/problems/move-zeroes/description/

public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes2(nums);
    }

    // First approach time complexity is 2ms
    public static void moveZeroes(int[] nums) {
        if (nums.length == 1) {
            return;
        }

        int nonZeroIndex = 0;

        // This loop shift non zero integers to left side
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }
        // This loop added zeros in the remaining length of the array
        while (nonZeroIndex < nums.length) {
            nums[nonZeroIndex] = 0;
            nonZeroIndex++;
        }
        for (int num: nums){
            System.out.print(num+" ");
        }
    }

    // Second approach time complexity is 1ms
    public static void moveZeroes2(int[] nums) {
        int n = nums.length;
        int i = 0;
        for (int j = 0; j < n; j++) {
            if (nums[j] != 0) {
                nums[i] = nums[j];
                i++;
            }
        }
        for (int k = i; k < n; k++) {
            nums[k] = 0;
        }
        for (int num: nums){
            System.out.print(num+" ");
        }
    }
}
