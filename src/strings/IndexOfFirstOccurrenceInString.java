package strings;

public class IndexOfFirstOccurrenceInString {
    public static void main(String[] args) {
        String haystack = "leetcode";
        String needle = "code";
        System.out.println(strStr2(haystack, needle));

    }

    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static int strStr2(String haystack, String needle) {
        int hLen = haystack.length();
        int nLen = needle.length();
        int nIndex = 0;
        for (int i = 0; i < hLen; i++) {
            // as long as the characters are equal, increment needleIndex
            if (haystack.charAt(i) == needle.charAt(nIndex)) {
                nIndex++;
            } else {
                // start from the next index of previous start index
                i = i - nIndex;
                // needle should start from index 0
                nIndex = 0;
            }
            // check if needleIndex reached needle length
            if (nIndex == nLen) {
                // return the first index
                return i - nLen + 1;
            }
        }
        return -1;
    }
}
