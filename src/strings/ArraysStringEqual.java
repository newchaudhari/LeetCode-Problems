package strings;

//https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/description/
public class ArraysStringEqual {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        arrayStringsAreEqual(word1, word2);


    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

//        String str1 = "";
//        String str2 = "";
//        for (int i = 0; i < word1.length; i++) {
//            str1 = str1 + word1[i];
//        }
//        for (int i = 0; i < word2.length; i++) {
//            str2 = str2 + word2[i];
//        }
//        if (str1.equalsIgnoreCase(str2)) {
//            return true;
//        }
//        return false;

        //second Approach
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();

        for (String word: word1) {
            str1.append(word);
        }
        for (String word: word2) {
            str2.append(word);
        }
        System.out.println(str1.toString().equals(str2.toString()));


        String s1=str1.toString();
        String s2=str2.toString();

        return s1.equals(s2);

    }
}
