package strings;

public class FirstUniqueCharInString {
    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(firstUniqChar(s));
    }
    //First Approach, Time Complexity is 7ms. Try Different approach
    public static int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i))) return i;
        }
        return -1;
    }
}
