package strings;

import java.util.Arrays;

//https://leetcode.com/problems/sort-the-people/description/

public class SortPeople {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Bob"};
        int[] heights = {155, 185, 150};
        System.out.println(Arrays.toString(sortPeople(names, heights)));

    }

    // first approach time complexity is 30ms, Try another approach
    public static String[] sortPeople(String[] names, int[] heights) {
        boolean swapped;
        for (int i = 0; i < heights.length; i++) {
            swapped = false;
            for (int j = 1; j < heights.length - i; j++) {
                if (heights[j] > heights[j - 1]) {
                    //swap
                    String temp = names[j];
                    names[j] = names[j - 1];
                    names[j - 1] = temp;

                    int temp1 = heights[j];
                    heights[j] = heights[j - 1];
                    heights[j - 1] = temp1;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
        return names;
    }
}
