package dataStructure.leetcode;

/**
 * Created by renzengtao on 2017/12/20.
 */

/**
 * 找到最长回文
 * 回文：从左到右，和从右到左都是一样的
 */
public class l_5_Longest_Palindromic_Substring {

    /**
     * http://www.cnblogs.com/TenosDoIt/p/3675788.html
     * @param s
     * @return
     */
    public static String longestPalindromebak(String s) {
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }


    public static String longestPalindrome(String s) {
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len = expandAroundCenter(s, i, i);
            System.out.println(len);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }



    private static int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }

    public static void main(String[] args) {
        String s = "abcba";
        System.out.println(longestPalindrome(s));
    }
}
