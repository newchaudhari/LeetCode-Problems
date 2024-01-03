package arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] array = {0,1,2,2,3,0,4,2};
        int i = removeElement(array, 2);
        System.out.println(i);
    }

    public static int removeElement(int[] nums, int val) {
        int n = nums.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
