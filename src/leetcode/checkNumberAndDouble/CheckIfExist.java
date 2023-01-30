package leetcode.checkNumberAndDouble;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CheckIfExist {
    public static boolean checkIfExist(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = arr.length;

        for(int i = 0; i < n; i++){
            map.put(arr[i], i);
        }

        for (int i = 0; i < n; i++){
            if (map.containsKey(2 * arr[i]) && map.get(2 * arr[i]) != i){
                return true;
            }
        }

        return false;
    }

    public  static  boolean checkIfExist2(int[] arr) {
        Arrays.sort(arr);
        int i;
        int j;
        for(i=0;i<arr.length;i++)
        {
            for(j=0;j<arr.length-1;j++) {
                if (i!=j && arr[i] == 2 * arr[j])
                    return true;
            }
        }
        return false;
    }


}
