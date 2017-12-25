package dataStructure.leetcode;

/**
 * Created by renzengtao on 2017/12/21.
 */
public class l_9_Palindrome_Number {
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        int div = 1;
        while (x / div >= 10) div *= 10;
        System.out.println(div);
        while (x > 0) {
            int left = x / div;
            int right = x % 10;
            if (left != right) return false;
            x = (x % div) / 10;
            div /= 100;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));
    }
}
