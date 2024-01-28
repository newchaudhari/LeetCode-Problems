package arrays;

//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/description/
public class MinimumInRotateSortedArray2 {
    public static void main(String[] args) {
        int[] arr = {3, 3, 1, 3};
        System.out.println(findMin(arr));

    }

    static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        if (nums[start] < nums[end]) return nums[start];

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else if (nums[mid] < nums[end]) {
                end = mid;
            } else {
                end--;
            }
        }

        return nums[end];
    }
}
