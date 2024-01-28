package arrays;

//https://leetcode.com/problems/number-of-employees-who-met-the-target/description/
public class EmployeesWhoMetTarget {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        System.out.println(numberOfEmployeesWhoMetTarget(arr, 2));
    }

    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int counter = 0;
        for (int hour : hours) {
            if (hour >= target) counter++;
        }
        return counter;
    }
}
