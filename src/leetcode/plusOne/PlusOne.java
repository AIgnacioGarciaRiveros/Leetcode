package leetcode.plusOne;

import java.math.BigInteger;

public class PlusOne {
    public  int[] plusOne(int[] digits) {
        for(int i = digits.length-1; i>=0; i--){
            if(digits[i]<9){  // case 1 : array have no 9 at end
                digits[i]++;
                return digits;
            }
            digits[i] = 0;  // case 2: for some 9 in last
        }
        int [] result = new int[digits.length+1];  // case 3: array containing all 9
        result[0] = 1;
        return result;
    }
    public  int[] plusOne2(int[] digits) {
        String res="";
        for(int i : digits){
            res += String.valueOf(i);
        }
        BigInteger result=new BigInteger(res);
        BigInteger p = new BigInteger("1");
        result = result.add(p);
        res = String.valueOf(result);
        int ult[]= new int[res.length()];
        int k = res.length();
        for(int i=0; i<k;i++){
            ult[i]=(Integer.valueOf(res.charAt(i))+2-50);
        }
        return ult;
    }
}
