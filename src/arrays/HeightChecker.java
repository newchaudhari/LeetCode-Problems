package arrays;

import java.util.Arrays;

//https://leetcode.com/problems/height-checker/
public class HeightChecker {
    public static void main(String[] args) {
        int[] arr = {1, 1, 4, 2, 1, 3};
        System.out.println(heightChecker2(arr));

    }

    public static int heightChecker(int[] heights) {
        boolean swapped;
        int[] arr = Arrays.stream(heights).toArray();
        for (int i = 0; i < heights.length; i++) {
            swapped = false;
            for (int j = 1; j < heights.length - i; j++) {
                if (heights[j] < heights[j - 1]) {
                    int temp = heights[j];
                    heights[j] = heights[j - 1];
                    heights[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return getCounter(heights, arr);
    }

    static int getCounter(int[] heights, int[] arr) {
        int counter = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != arr[i]) {
                counter++;
            }
        }
        return counter;
    }

    //Second Approach : time complexity is less than first
    public static int heightChecker2(int[] heights) {
        int[] expected = heights.clone();
        Arrays.sort(expected);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                count++;
            }
        }
        return count;
    }

}
