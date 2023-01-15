package leetcode.twoSumII;

public class TwoSumII {
    public  int[] twoSum(int [] nums,int target)
    {
        int i=0;
        int j= nums.length-1;
        int sum;
        while(i<j)
        {
            sum=nums[i]+nums[j];
            if(sum==target)
            {
                return new int[]{++i,++j};
            }else if(sum<target)
            {
                i++;
            }else {
                j--;
            }
        }
        return null;
    }
}
