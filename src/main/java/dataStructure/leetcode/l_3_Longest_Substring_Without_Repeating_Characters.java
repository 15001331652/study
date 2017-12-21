package dataStructure.leetcode;

/**
 * Created by renzengtao on 2017/12/18.
 */

import java.util.HashMap;
import java.util.Map;

/**
 * 找到最长不重复的子串,返回长度
 */
public class l_3_Longest_Substring_Without_Repeating_Characters {
    /**
     * 暴力法n3
     */
//    public static int lengthOfLongestSubstring(String s) {
//        int n = s.length();
//        int ans = 0;
//        for (int i = 0; i < n; i++)
//            for (int j = i + 1; j <= n; j++)
//                if (allUnique(s, i, j)) ans = Math.max(ans, j - i);
//        return ans;
//    }
//
//    public static boolean allUnique(String s, int start, int end) {
//        Set<Character> set = new HashSet<Character>();
//        for (int i = start; i < end; i++) {
//            Character ch = s.charAt(i);
//            if (set.contains(ch)) return false;
//            set.add(ch);
//        }
//        return true;
//    }
    /**
     * 思路：
     * 举例：abckfcublo
     * i = 0  j 一直往前走，然后一直通过j-i+1算子串长度，当j遇到第二个c的时候，第二个c是在当前窗口中，调整i的值，到k，其他逻辑不变
     * 当j遇到第二个b的时候，因为上一个b存在上一个窗口中，不用理会，接着走逻辑
     * @param s
     * @return
     */
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>(); // current index of character
        /* try to extend the range [i, j] */
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                System.out.println("map.get(s.charAt(j))+1 ：" + (map.get(s.charAt(j)) + 1));
                System.out.println(" i ：" + i);
                i = Math.max(map.get(s.charAt(j)) + 1, i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j);
        }
        return ans;
    }

    public static void main(String[] args) {
//        System.out.println(lengthOfLongestSubstring("aaaabbbbccffaaaaaa"));
        String s = "abcdcfkibol";

//        System.out.println(s.charAt(2));        System.out.println(s.charAt(2));
        System.out.println(lengthOfLongestSubstring(s));
//        System.out.println(lengthOfLongestSubstringbak("aaaabbbbccckfaaaaaa"));

    }
}
