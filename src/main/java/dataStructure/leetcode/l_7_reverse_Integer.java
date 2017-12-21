package dataStructure.leetcode;

/**
 * Created by renzengtao on 2017/12/20.
 */
public class l_7_reverse_Integer {
    //123
    public static int reverse(int n) {
        int result = 0;
        while (n != 0) {
            result = result * 10 + n%10;
            n = n/10;
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(reverse(12));
    }

}
