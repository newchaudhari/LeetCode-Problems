package arrays;

//https://leetcode.com/problems/search-in-rotated-sorted-array/description/
public class DuplicateRotateSortedArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        DuplicateRotateSortedArray rotateSortedArray = new DuplicateRotateSortedArray();
        System.out.println(rotateSortedArray.search(arr, target));
    }

    public int search(int[] nums, int target) {
        int pivot = findPivotWithDuplicates(nums);
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

    int findPivotWithDuplicates(int[] nums) {
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

            //if number at start, middle and end are equal then just skip the duplicates
            if (nums[mid] == nums[start] && nums[mid] == nums[end]) {
                //skip duplicates
                //NOTE: what if these elements at start and end were the pivot??
                //check if start is pivot
                if (start < end && nums[start] > nums[start + 1]) {
                    return start;
                }
                start++;
                // check if end is pivot
                if (end > start && nums[end] < nums[end - 1]) {
                    return end - 1;
                }
                end--;
            } else if (nums[start] < nums[mid] || (nums[start] == nums[mid]) && nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }


        }
        return -1;
    }
}
