package leetcode.validMountain;

public class ValidMountain {

    public static boolean validMountainArray(int[] arr) {
        if (arr == null || arr.length < 3) {
            return false;
        }
        int leftTop = 0;
        int rightTop = arr.length - 1;
        while (leftTop < arr.length -2) {
            if (arr[leftTop] < arr[leftTop + 1]) {
                leftTop++;
            } else {
                break;
            }
        }
        while (rightTop > 1) {
            if (arr[rightTop] < arr[rightTop - 1]) {
                rightTop--;
            } else {
                break;
            }
        }
        return leftTop == rightTop;
    }
    public boolean validMountainArray2(int[] arr) {
        if(arr.length <3)
            return false;
        boolean isMountainGrowing=false;
        boolean isMountainDecreasing=false;

        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]<arr[i+1])
            {
                isMountainGrowing=true;
            }else if(arr[i]>arr[i+1]){
                isMountainDecreasing=true;
            }else{//equals
                return false;
            }

            if(isMountainDecreasing &&(arr[i]<arr[i+1]))
            {
                return false;
            }
        }
        return isMountainGrowing&&isMountainDecreasing;
    }
}
