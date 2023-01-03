package leetcode.containsDuplicate;

import java.util.Arrays;

public class ContainsDuplicate {

  public  boolean containsDuplicate(int[] nums) {
      int i=0;
      int j=i+1;
      Arrays.sort(nums);

      for(i=0;i<nums.length-1;i++)
      {
          if(nums[i]==nums[j])
              return true;
          j++;
      }
      return false;
  }

}
