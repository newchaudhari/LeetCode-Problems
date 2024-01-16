package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDuplicatesInArray {
    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(arr));

    }

    //This is also not an ideal way try to find different solution
    public static List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);
        List<Integer> elements = new ArrayList<>();
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                elements.add(nums[i]);
            }
        }
        return elements;
    }

    //second approach that will take long time than previous
   /* public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> duplicated = new HashSet<>();
        List<Integer> elements = new ArrayList<>();
        for(int i=0; i < nums.length; i++){
            if(duplicated.contains(nums[i])){
                elements.add(nums[i]);
            }
            duplicated.add(nums[i]);
        }
        return elements;
    }*/
}
