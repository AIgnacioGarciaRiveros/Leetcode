package leetcode.missingNumber;

import java.util.Arrays;

public class MissingNumber {

        public int missingNumber(int[] nums) {
            int i;
            Arrays.sort(nums);
            for(i=0;i<nums.length;i++)
            {
                if(nums[i]!=i)
                    break;
            }
            return i;
        }

        public int missingNumber2(int[] nums) {
            int i;
            int numbersRange[]=new int [nums.length+1];
            for(i=0;i<numbersRange.length;i++)
                numbersRange[i]=i;

            Arrays.sort(nums);
            for(i=0;i<nums.length;i++)
            {
                if(nums[i]!=numbersRange[i])
                    break;
            }
            return numbersRange[i];
        }




}
