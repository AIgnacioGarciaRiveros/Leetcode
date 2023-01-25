package leetcode.removeDuplicates;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int repeatedNumber=0;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i==0||nums[i]!=repeatedNumber)
            {
                nums[count++]=nums[i];
                repeatedNumber=nums[i];
            }
        }
        return count;
    }
}
