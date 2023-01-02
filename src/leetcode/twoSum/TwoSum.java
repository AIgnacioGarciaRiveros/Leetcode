package leetcode.twoSum;

public class TwoSum {

    private  int[] twoSum(int[] nums, int target) {
        int indexSolution[] = new int[2];
        int i;
        int j;
        for (i = 0; i < nums.length; i++)
        {
            for (j=i+1;j<nums.length;j++)
            {
                if( nums[i]+nums[j] == target )
                {
                    indexSolution[0]=i;
                    indexSolution[1]=j;
                    break;
                }
            }
        }
        return indexSolution;
    }

    private  int[] twoSum2(int[] nums, int target) {
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
