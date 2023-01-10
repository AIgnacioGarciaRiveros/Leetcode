package leetcode.moveZeroes;

import java.util.Arrays;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        if(nums.length!=1) {
            int i;
            int j;
            for (i = 0; i < nums.length - 1; i++) {
                for (j = i + 1; j < nums.length; j++) {
                    if (nums[i] == 0 && nums[j] != 0) {
                        nums[i] = nums[j];
                        nums[j] = 0;
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public void moveZeroes2(int[] nums) {

        int k = 0; // pointer for next non zero elements

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;

                k++;
            }
        }
        System.out.println(Arrays.toString(nums));

    }
}
