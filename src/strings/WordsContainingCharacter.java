package strings;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-words-containing-character/description/
public class WordsContainingCharacter {
    public static void main(String[] args) {
        String[] str = {"leet", "code"};
        System.out.println(findWordsContaining(str, 'e'));

    }

    // first approach and time complexity of 2ms
    public static List<Integer> findWordsContaining(String[] words, char x) {
        List indices = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            char[] chars = words[i].toCharArray();
            for (int j = 0; j < chars.length; j++) {
                if (chars[j] == x) {
                    indices.add(i);
                    break;
                }
            }
        }
        return indices;
    }

    // second approach and best for time complexity of 1ms
    public static List<Integer> findWordsContaining2(String[] words, char x) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(j) == x) {
                    ans.add(i);
                    break;
                }
            }
        }
        return ans;
    }
}
