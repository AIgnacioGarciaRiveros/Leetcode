package leetcode.maxConsecutiveOnes;

public class MaxConsecutiveOnes {
        public int findMaxConsecutiveOnes(int[] nums) {
            int consecutiveOnes=0;
            int maxConsecutiveOnes=0;
            for(int i=0;i< nums.length;i++)
            {
                if(nums[i]==1)
                {
                    consecutiveOnes++;
                }else{
                    consecutiveOnes=0;
                }
                if(consecutiveOnes>maxConsecutiveOnes)
                    maxConsecutiveOnes=consecutiveOnes;

            }

            return maxConsecutiveOnes;
        }
}
