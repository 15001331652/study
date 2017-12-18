package dataStructure.mock;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by renzengtao on 2017/12/18.
 */
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] returnArray = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == null) {
                map.put(target - nums[i], i);
            } else {
                returnArray[0] = map.get(nums[i]);
                returnArray[1] = i;
                return returnArray;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(twoSum(array,10)));
    }
}
