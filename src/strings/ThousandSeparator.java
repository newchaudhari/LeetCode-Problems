package strings;

public class ThousandSeparator {
    public static void main(String[] args) {


    }
    public static String thousandSeparator(int n) {
        String string="";
        String str1="";
        if(n<1000){
            return string+n;
        }else {
            StringBuilder stringBuilder=new StringBuilder();
            stringBuilder.append(n);
            String string1 = stringBuilder.toString();
            char[] charArray = string1.toCharArray();
        }
        return string;
    }
}
