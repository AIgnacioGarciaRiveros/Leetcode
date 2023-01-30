package leetcode.mergeSorted;

import java.util.Arrays;

public class MergeSorted {
    public  void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n==0)
            return;
        int index= nums1.length-1;
        m--;
        n--;
        while(n>=0)
        {
            if(m>=0 && nums1[m]>nums2[n])
            {
                nums1[index]=nums1[m];
                m--;
            }else{
                nums1[index]=nums2[n];
                n--;
            }
            index--;
        }
    }

    public  void merge2(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;
        while (i >= 0 && j >= 0) {
            nums1[k--] = nums1[i] > nums2[j] ? nums1[i--] : nums2[j--];
        }
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}
