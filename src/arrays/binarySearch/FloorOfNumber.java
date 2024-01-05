package arrays.binarySearch;

public class FloorOfNumber {
    public static void main(String[] args) {
        int[] array = {2, 4, 5, 9, 11, 12, 14, 16, 18};
        int target = 7;
        System.out.println(floor(array, target));
    }

    public static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return arr[mid];
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr[end];
    }
}
