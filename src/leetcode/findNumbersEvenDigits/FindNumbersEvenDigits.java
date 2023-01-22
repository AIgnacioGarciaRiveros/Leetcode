package leetcode.findNumbersEvenDigits;

public class FindNumbersEvenDigits {
    public int findNumbers(int[] nums) {
        int evenNumbers=0;
        for(int i=0;i<nums.length;i++)
        {
            if(String.valueOf(nums[i]).length()%2==0)
                evenNumbers++;
        }
        return evenNumbers;
    }
}
