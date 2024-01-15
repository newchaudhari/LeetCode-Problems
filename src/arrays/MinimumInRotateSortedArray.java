package arrays;

public class MinimumInRotateSortedArray {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7, 1, 2};
        System.out.println(findMin(arr));

    }

    static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid > start && nums[mid] < nums[mid - 1]) {
                return nums[mid];
            } else if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return nums[start];
    }
}
