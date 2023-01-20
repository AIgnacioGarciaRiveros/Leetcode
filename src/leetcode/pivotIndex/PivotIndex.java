package leetcode.pivotIndex;

public class PivotIndex {
    public  int pivotIndex(int[] nums){
        int sum=0;
        int sumLeft= 0;
        int i;
        for(i=0;i<nums.length;i++)
            sum+=nums[i];

        for(i=0;i<nums.length;i++)
        {
            sum-=nums[i];
            if(sumLeft==sum)
                return i;

            sumLeft+=nums[i];
        }
        return -1;
    }

    public int pivotIndex2(int[] nums) {
        int sumLeft[] = new int[nums.length];
        int sumRight[] = new int[nums.length];
        int i;
        int j;
        for (i = 0; i < nums.length; i++) {
            for (j = 0; j < nums.length; j++) {
                if (j < i) {
                    sumLeft[i] += nums[j];
                }

                if (j > i) {
                    sumRight[i] += nums[j];
                }

                if (sumLeft[i] == sumRight[i])
                    return i;
            }
        }

        return -1;
    }



}
