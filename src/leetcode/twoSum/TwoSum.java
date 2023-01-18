package leetcode.twoSum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    private  int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> complementOfNums = new HashMap<>();
        int complement;
        for (int i = 0; i < nums.length; i++)
        {
            complement=target-nums[i];
            if(complementOfNums.containsKey(complement))
            {
                return new int[]{complementOfNums.get(complement),i};
            }
            complementOfNums.put(nums[i],i);
        }
        return null;
    }

    private  int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> complements = new HashMap<>();
        Integer complementIndex;
        for (int i = 0; i < nums.length; i++)
        {
            complementIndex=complements.get(nums[i]);
            if(complementIndex != null)
            {
                return new int[]{i,complementIndex};
            }
            complements.put(target-nums[i],i);
        }
        return nums;
    }
    private  int[] twoSum3(int[] nums, int target) {
        int i;
        int j;
        for (i = 0; i < nums.length; i++)
        {
            for (j=i+1;j<nums.length;j++)
            {
                if( nums[i]+nums[j] == target )
                {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

}
