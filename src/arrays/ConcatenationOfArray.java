package arrays;

import java.util.Arrays;

//https://leetcode.com/problems/concatenation-of-array/description/
public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        System.out.println(Arrays.toString(getConcatenation(arr)));

    }

    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        int counter = 0;
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j < nums.length; j++) {
                ans[counter] = nums[j];
                counter++;
            }
        }
        return ans;
    }

    //2nd approach to concat array which has less time duration
    public int[] getConcatenation2(int[] nums) {
        int originalSize = nums.length;
        int newArraySize = nums.length * 2;
        int[] result = new int[newArraySize];

        System.arraycopy(nums, 0, result, 0, originalSize);
        System.arraycopy(nums, 0, result, originalSize, originalSize);

        return result;
    }

}
