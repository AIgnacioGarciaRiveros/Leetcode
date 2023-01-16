package leetcode.insertElement;

public class InsertElement {
    public int[] insertElementAtBeggining(int []nums,int element)
    {
        int [] newNums=new int[nums.length+1];
        newNums[0]=element;
        for(int i=0;i<nums.length;i++)
        {
            newNums[i+1]=nums[i];
        }
        return newNums;
    }
    public int[] insertElementAtEnd(int []nums,int element)
    {
        int [] newNums=new int[nums.length+1];
        newNums[nums.length]=element;
        for(int i=0;i<nums.length;i++)
        {
            newNums[i]=nums[i];
        }
        return newNums;
    }
}
