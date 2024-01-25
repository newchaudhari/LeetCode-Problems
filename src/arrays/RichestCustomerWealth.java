package arrays;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] arr = {
                {2, 8, 7},
                {7, 1, 3},
                {1, 9, 5}
        };
        System.out.println(maximumWealth(arr));
    }

    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if (sum >= maxWealth) maxWealth = sum;
        }
        return maxWealth;
    }

}
