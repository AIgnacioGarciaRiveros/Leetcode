package leetcode.sortedSquare;

import java.util.Arrays;

public class SortedSquare {

    public static int[] sortedSquare(int []nums)
    {
        int leftPointer=0;
        int rightPointer=nums.length-1;
        int leftSquared;
        int rightSquared;
        int index= nums.length-1;
        int  [] squaredNumbers=new int [nums.length];
        while(leftPointer<=rightPointer)
        {
            leftSquared=nums[leftPointer]*nums[leftPointer];
            rightSquared=nums[rightPointer]*nums[rightPointer];

            if(leftSquared<rightSquared)
            {
                squaredNumbers[index--]=rightSquared;
                rightPointer--;
            }else
            {
                squaredNumbers[index--]=leftSquared;
                leftPointer++;
            }

        }

        return squaredNumbers;
    }

    public int[] sortedSquare2(int []nums)
    {
        for(int i=0;i<nums.length;i++)
            nums[i]*=nums[i];

        Arrays.sort(nums);
        return nums;
    }
}
