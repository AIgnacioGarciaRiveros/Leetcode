package leetcode.runningSum;

public class RunningSum {
    public int[] runningSum(int[] nums) {
        int numsSum[]=new int[nums.length];
        for( int i = 0; i<nums.length; i++){
            for( int j = 0; j<i+1; j++) {
                numsSum[i] += nums[j];
            }
        }
        return numsSum;
    }
}
