package leetcode.duplicateZeros;

public class DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        int [] auxiliarArray = new int[arr.length];
        int i=0;
        int index=0;
        for (i=0;i<arr.length;i++)
            auxiliarArray[i]=arr[i];

        for (i=0;index<arr.length;i++)
        {
            if(auxiliarArray[i]==0 &&((index+1) != arr.length))
            {
                arr[index]=0;
                arr[++index]=0;
                index++;
            }else{
                arr[index++]=auxiliarArray[i];
            }
        }
    }
}
