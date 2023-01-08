package leetcode.majorityElement;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    //Boyer-Moore Voting Algorithm
    public  int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            if(num==candidate){
                count+=1;
            }else{
                count-=1;
            }
        }
        return candidate;
    }

    // Sorting
    public  int majorityElement1(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
    //HashMap
    public  int majorityElement2(int[] nums) {
        Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
        int ret=0;
        for (int num: nums) {
            if (!myMap.containsKey(num))
                myMap.put(num, 1);
            else
                myMap.put(num, myMap.get(num)+1);
            if (myMap.get(num)>nums.length/2) {
                ret = num;
                break;
            }
        }
        return ret;
    }
}
