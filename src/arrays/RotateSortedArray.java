package arrays;

//https://leetcode.com/problems/search-in-rotated-sorted-array/description/
public class RotateSortedArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        RotateSortedArray rotateSortedArray = new RotateSortedArray();
        System.out.println(rotateSortedArray.search(arr, target));
    }

    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        //if you did not find pivot , it means it is not rotate array
        if (pivot == -1) {
            //just do normal binary search
            return binarySearch(nums, target, 0, nums.length - 1);
        }
        //if pivot == target returns pivot
        if (nums[pivot] == target) {
            return pivot;
        }
        //if target > starting number then start from 0 and end = pivot-1 i.e largest number-1
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }
        //if target < starting number then start from pivot+1 i.e largest number+1 and end = array.length-1
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }


    int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;

    }

    int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            if (nums[mid] <= nums[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;
    }
}
