package dataStructure.leetcode;

/**
 * Created by renzengtao on 2017/12/19.
 */

/**
 * 你是一个职业强盗，打算抢劫街上的房子。每个房子都有一定量的存款，唯一的约束阻止你抢它们是相邻的房屋有安全系统连接，它会自动与警方联系，如果两个相邻的房屋被分解成在同一个晚上。
   给出一个非负数的整数表，代表每个房子的钱数，确定今晚你可以抢劫的最大金额而不报警。
 */
public class l_198_House_Robber {

    public static int solve(int idx, int[] nums) {
        if (idx < 0) {
            return 0;
        }
        return Math.max(nums[idx] + solve(idx - 2, nums), solve(idx - 1, nums));
    }

    public static void main(String[] args) {
        int[] nums = {1,100,4,9,9,19};
        System.out.println(solve(nums.length-1,nums));
    }
}
