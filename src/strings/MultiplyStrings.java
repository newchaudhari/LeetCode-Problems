package strings;

import java.math.BigInteger;

//https://leetcode.com/problems/multiply-strings/description/?envType=list&envId=pi8tk6d3
public class MultiplyStrings {
    public static void main(String[] args) {
        String num1 = "498828660196";
        String num2 = "840477629533";
        System.out.println(multiply1(num1, num2));
//        convert1("1234567890");
    }

    // Following two methods are not useful for big Numbers
    // We can use BigInteger class if we want to or can use 3 method of this class i.e multiply1
    private static String multiply(String num1, String num2) {
        String str = "";
        long nummber1 = convert(num1);
        long nummber2 = convert(num2);
        long multiply = nummber1 * nummber2;
        return str + multiply;

    }

    public static long convert(String num1) {
        long num = 0;
        for (int i = 0; i < num1.length(); i++) {
            num = num * 10 + ((long) num1.charAt(i) - 48);
        }
        return num;
    }

    // Used to test method for converting string num to integers
    public static void convert1(String num) {
        int num1 = 0;
        for (int i = 0; i < num.length(); i++) {
            // to convert char to int, subtract it by 48 i.e ASCII value for numbers
            int c = num.charAt(i);
            System.out.print(c + " ");
        }

    }


    // This method can be used big numbers
    public static String multiply1(String num1, String num2) {
        if ("0".equals(num1) || "0".equals(num2))
            return "0";

        int[] ans = new int[num1.length() + num2.length() - 1];

        for (int i = 0; i < num1.length(); i++) {
            for (int j = 0; j < num2.length(); j++) {
                ans[i + j] += (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
            }
        }

        for (int i = ans.length - 1; i > 0; i--) {
            ans[i - 1] += ans[i] / 10;
            ans[i] %= 10;
        }

        StringBuilder sb = new StringBuilder();
        for (int i : ans) {
            sb.append(i);
        }

        return sb.toString();
    }

}
