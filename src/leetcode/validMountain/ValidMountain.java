package leetcode.validMountain;

public class ValidMountain {
    public  boolean validMountainArray2(int[] arr) {
        //it works
        if(arr.length <3)
            return false;
        boolean increment=true;
        boolean decrement=false;
        int incrementExist=0,decrementExist=0;

        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]<arr[i+1] && increment)
                incrementExist=1;
            if(arr[i]>arr[i+1])
            {
                decrement=true;
                decrementExist=1;
            }

            if(decrement &&arr[i]<arr[i+1])
                return false;
            if(arr[i]==arr[i+1])
                return false;
        }
        return incrementExist!=0 && decrementExist!=0;
    }
    public  boolean validMountainArray(int[] arr) {
        if(arr.length <3)
            return false;
        int startingToDecrement=0;
        int startingToIncrement=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i+1]<arr[i])
            {
                startingToDecrement=1;
            }
            if(startingToDecrement!=0 &&(arr[i+1]>arr[i]))
            {
                return false;
            }
            if(arr[i]==arr[i+1])
                return false;

        }

        //return true;
        return (startingToDecrement == 0) ? false: true;
    }
}
