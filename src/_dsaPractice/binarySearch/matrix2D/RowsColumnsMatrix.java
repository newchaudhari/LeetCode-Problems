package _dsaPractice.binarySearch.matrix2D;

import java.util.Arrays;

public class RowsColumnsMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {-1, 3}
        };
        System.out.println(Arrays.toString(search(arr, -1)));

    }

    static int[] search(int[][] matrix, int target) {
        int r = 0;
        int c = matrix.length - 1;

        while (r < matrix.length && c >= 0) {
            if (matrix[r][c] == target) {
                return new int[]{r, c};
            }
            if (matrix[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }


        return new int[]{-1, -1};
    }
}
