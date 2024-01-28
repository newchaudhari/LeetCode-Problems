package arrays;

//https://leetcode.com/problems/find-the-highest-altitude/description/
public class HighestAltitudes {
    public static void main(String[] args) {
        int[] arr = {-5, 1, 5, 0, -7};
        System.out.println(largestAltitude(arr));
    }

    public static int largestAltitude(int[] gain) {
        int sum = 0;
        int altitude = 0;
        for (int i = 0; i < gain.length; i++) {
            sum = gain[i] + sum;
            altitude = Math.max(altitude, sum);
        }
        return altitude;
    }
}
