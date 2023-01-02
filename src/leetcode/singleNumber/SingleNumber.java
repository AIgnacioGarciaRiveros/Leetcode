package leetcode.singleNumber;

import java.util.Arrays;

public class SingleNumber {

    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums.length == 1)
            return nums[0];

        int numberOfRepeats;
        int i;
        int j;
        numberOfRepeats=0;
        for(i=0;i<nums.length;i++)
        {
            for(j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    numberOfRepeats++;
                    i++;
                }
            }
            if(numberOfRepeats == 0)
                break;

            numberOfRepeats=0;
        }
        return nums[i];
    }
}
