package leetcode.searchInsertPosition;

public class SearchInsertPosition {

    public  int searchInsert(int[] nums, int target) {
        int i;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]-target>=0)
                return i;
        }
        return nums.length;
    }
}
