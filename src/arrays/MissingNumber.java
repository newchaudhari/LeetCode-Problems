package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/missing-number/description/

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println(missingNumber(nums));

    }

    // First Approach using Naive Approach - Sorting, Time Complexity is 6ms
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return n;
    }

    // Second Approach using Mathematical Formula, Time Complexity is 0ms
    public int missingNumber2(int[] nums) {
        //This approach uses the formula to calculate the sum of the first n numbers (n*(n+1)/2),
        //then subtracts the sum of the array from it. The result is the missing number.
        //Find the sum of the first n numbers using the formula n*(n+1)/2.
        //Find the sum of the array.
        //Subtract the sum of the array from the sum of the first n numbers.
        int n = nums.length;
        int sum = n * (n + 1) / 2;
        for (int num : nums) {
            sum -= num;
        }
        return sum;
    }

    // Third Approach using Bit Manipulation (XOR), Time Complexity is 0ms
    public int missingNumber3(int[] nums) {

        //In this approach, you use bitwise XOR operation to find the missing number.
        //XOR operation on a number with itself results in 0. So, if you XOR all the numbers from 0 to n
        //and all the numbers in the array,the result will be the missing number.

        //Initialize missing to 0.
        //Iterate over the array and XOR each number with missing.
        //After the iteration, the value in missing will be the missing number.
        int missing = nums.length;
        for (int i = 0; i < nums.length; i++) {
            missing ^= i ^ nums[i];
        }
        return missing;
    }

    // Fourth Approach using Hash Table, Time Complexity is 6ms
    public int missingNumber4(int[] nums) {
        //This approach uses a hash table to store each number in the array.
        // Then, it iterates over the sequence 0, 1, ..., n to find the missing number.

        //Create an empty hash table.
        //Iterate over the array and store each number in the hash table.
        //Iterate over the sequence 0, 1, ..., n and check if each number is in the hash table.
        //The missing number is the one that isn't in the hash table.
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for (int i = 0; i <= nums.length; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return -1;
    }
}
