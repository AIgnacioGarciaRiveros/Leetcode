package leetcode.plusOne;

public class PlusOne {
    public  int[] plusOne(int[] digits) {
        int i;
        int j;
        int arrayToInt=0;
        int digit;
        int amountOfNumbers=1;
        if(digits.length==1)
        {
            amountOfNumbers++;
        }
        for(i=0;i<digits.length-1;i++)
        {
            digit=digits[i];
            for (j=digits.length-1-i;j>0;j--)
            {
                digit*=10;
            }
            arrayToInt+=digit;
            amountOfNumbers++;
        }
        arrayToInt+=digits[digits.length-1]+1;
        if(arrayToInt%10==0)
            amountOfNumbers++;
        int newDigits[]= new int[amountOfNumbers];
        i=1;
        while(newDigits.length>=i)
        {
            newDigits[newDigits.length-i]=arrayToInt%10;
            i++;
            arrayToInt/=10;
        }
        return newDigits;
    }
}
