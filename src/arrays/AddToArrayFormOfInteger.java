package arrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
//https://leetcode.com/problems/add-to-array-form-of-integer/description/?envType=list&envId=pi8tk6d3

public class AddToArrayFormOfInteger {
    public static void main(String[] args) {
        int[] array = {9, 9, 9, 9, 9, 9, 9, 9, 9};
//        addToArrayForm(array, 1);
        System.out.println(addToArrayForm1(array, 1));

    }

    // Best as of Time Complexity 2ms
    // Review this code later
    public static List<Integer> addToArrayForm(int[] num, int k) {
        LinkedList<Integer> res = new LinkedList<>();
        int carry = 0;
        int i = 0;
        for (i = num.length - 1; i >= 0 && k > 0; i--) {
            int temp = num[i];
            res.addFirst((temp + carry + (k % 10)) % 10);
            carry = (temp + carry + (k % 10)) / 10;
            k /= 10;
        }
        while (k != 0) {
            int compute = (k % 10) + carry;
            res.addFirst(compute % 10);
            carry = compute / 10;
            k /= 10;
        }
        for (int r = i; r >= 0; r--) {
            int temp = num[r];
            res.addFirst((temp + carry) % 10);
            carry = (temp + carry) / 10;
        }
        if (carry != 0) res.addFirst(carry);
        return res;
    }

    // Worst time Complexity 52ms
    public static List<Integer> addToArrayForm1(int[] num, int K) {
        List<Integer> res = new ArrayList<>();
        for (int i = num.length - 1; i >= 0; --i) {
            res.add(0, (num[i] + K) % 10);
            K = (num[i] + K) / 10;
        }
        while (K > 0) {
            res.add(0, K % 10);
            K /= 10;
        }
        return res;
    }
}
