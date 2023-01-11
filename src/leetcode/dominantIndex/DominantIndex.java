package leetcode.dominantIndex;

public class DominantIndex {
    
    public int dominantIndex(int[] nums) {
        int largestElement=nums[0];
        int largestElementIndex=0;
        int i;
        for(i=1;i<nums.length;i++){
            if(nums[i]>largestElement)
            {
                largestElement=nums[i];
                largestElementIndex=i;
            }
        }

        for(i=0;i<nums.length;i++)
        {
            if(i!=largestElementIndex &&((nums[i]+nums[i])>largestElement))
                return -1;
        }
        return largestElementIndex;
    }

    public int dominantIndex2(int[] nums) {
        int largestElement = nums[0];
        int secondLargestElement = 0;
        int largestElementIndex = 0;
        int i;
        for (i = 1; i < nums.length; i++) {
            if (nums[i] > largestElement) {
                secondLargestElement=largestElement;
                largestElement = nums[i];
                largestElementIndex = i;
            } else if (secondLargestElement<nums[i]) {
                secondLargestElement=nums[i];
            }
        }

        return largestElement<(2*secondLargestElement) ? -1 : largestElementIndex;
    }
}
