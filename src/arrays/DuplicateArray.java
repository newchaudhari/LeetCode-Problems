package arrays;

public class DuplicateArray {
    public static void main(String[] args) {
        int[] array={0,0,1,1,1,2,2,3,3,4};
        int i = removeDuplicates(array);
        System.out.println(i);
    }
    public static int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

}
