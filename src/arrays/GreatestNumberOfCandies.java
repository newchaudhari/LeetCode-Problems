package arrays;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/
public class GreatestNumberOfCandies {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 1, 3};
        System.out.println(kidsWithCandies(arr, 3));

    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int maxCandy = maxCandyInArray(candies);
        for (int candy : candies) {

            if ((candy + extraCandies) >= maxCandy) {
                ans.add(true);
            } else {
                ans.add(false);
            }
        }
        return ans;
    }

    public static int maxCandyInArray(int[] candies) {
        int maxCandy = 0;
        for (int i = 0; i < candies.length; i++) {
            maxCandy = Math.max(maxCandy, candies[i]);
        }
        return maxCandy;
    }
}
