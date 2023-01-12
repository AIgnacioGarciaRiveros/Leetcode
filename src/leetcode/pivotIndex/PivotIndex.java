package leetcode.pivotIndex;

public class PivotIndex {
    public int pivotIndex(int [] nums)
    {
        int sumLeft[] = new int [nums.length];
        int sumRight[] = new int [nums.length];
        int i;
        int j;
        for(i=0;i<nums.length;i++)
        {
            for(j=0;j<nums.length;j++)
            {
                if(j<i)
                {
                    sumLeft[i]+=nums[j];
                }

                if(j>i)
                {
                    sumRight[i]+=nums[j];
                }

                if(sumLeft[i]==sumRight[i])
                    return i;
            }
        }
}
