package strings;

import java.util.Arrays;

//https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/description/?envType=list&envId=pi8tk6d3
public class MaximumNumberOfWordsFound {
    public static void main(String[] args) {
        String[] strings = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound2(strings));

    }

    // First approach time complexity is 3ms
    public static int mostWordsFound(String[] sentences) {
        int count = 0;
        for (int i = 0; i < sentences.length; i++) {
            String[] s = sentences[i].split(" ");
            if (s.length > count) {
                count = s.length;
            }
        }
        return count;
    }


    //Second approach time complexity is 1ms
    public static int mostWordsFound2(String[] sentences) {
        int cnt = 0;

        for (int i = 0; i < sentences.length; i++) {
            cnt = Math.max(cnt, counterOfWords(sentences[i]));
        }
        return cnt;
    }

    private static int counterOfWords(String sentence) {
        int cnt = 1;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                cnt++;
            }
        }
        return cnt;
    }


}
