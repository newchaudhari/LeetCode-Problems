package arrays;

import java.util.Arrays;

//https://leetcode.com/problems/single-number/description/
public class SingleNumber {
    public static void main(String[] args) {
        int[] array = {2, 2, 1};
//        System.out.println(singleNumber(array));
        int i = singleNumber(array);
        System.out.println(i);
    }

    public static int singleNumber(int[] nums) {
        //1 code using bitwise operator
        int result=0;
        for(int i=0; i<nums.length; i++) {
            result = result^nums[i];
        }
        return result;


        //2 code using Array method

       /* Arrays.sort(nums);
        if (nums.length == 1) {
            return nums[0];
        }
        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return nums[nums.length - 1];*/
    }

}

