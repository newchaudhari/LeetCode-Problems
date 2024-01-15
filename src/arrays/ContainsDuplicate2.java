package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 1, 2, 3};
        int k = 2;
        System.out.println(containsDuplicate(array, k));
    }

    public static boolean containsDuplicate(int[] nums, int k) {
        //First Approach

//        Arrays.sort(nums);
        int counter=0;
        Set<Integer> integers = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (integers.contains(nums[i])){
                counter++;
            }
            integers.add(nums[i]);

        }

        return false;
    }
}
