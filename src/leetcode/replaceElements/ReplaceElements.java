package leetcode.replaceElements;

public class ReplaceElements {
    public  int[] replaceElements(int[] arr) {
        int max = -1;
        for(int i=arr.length-1;i>=0;i--){
            int element = arr[i];
            arr[i]= max;
            if(max<element){
                max = element ;
            }
        }
        return arr;
    }
    public  int[] replaceElements2(int[] arr) {
        int biggestNumber;
        for(int i=0;i< arr.length-1;i++)
        {
            biggestNumber=-1;
            for(int j=i+1;j<arr.length;j++)
            {
                if(j==1||biggestNumber<arr[j])
                {
                    biggestNumber=arr[j];
                }
            }
            arr[i]=biggestNumber;
        }
        arr[arr.length-1]=-1;
        return arr;
    }

}
