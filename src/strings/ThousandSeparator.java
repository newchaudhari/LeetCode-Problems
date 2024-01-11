package strings;

public class ThousandSeparator {
    public static void main(String[] args) {
        String string = thousandSeparator(130);
        System.out.println(string);
    }

    public static String thousandSeparator(int n) {


      /*  String str1 = "";
        if (n < 1000) {
            return string + n;
        } else {
            String string1 = String.valueOf(n);
            StringBuilder stringBuilder = new StringBuilder(string1);
            stringBuilder.insert(1, '.');
            str1 = stringBuilder.toString();
        }
        return str1;*/


        //second approach this is best as time and space complexity
        String num = String.valueOf(n); //first get num as string
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num.length(); i++) {//for all digits
            if (i != 0 && (num.length() - i) % 3 == 0) { //if the digit index divisible to three add separator
                sb.append(".");
            }
            sb.append(num.charAt(i)); //always add the number
        }
        return sb.toString();


    }
}
