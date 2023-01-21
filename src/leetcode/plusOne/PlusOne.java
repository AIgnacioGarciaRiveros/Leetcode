package leetcode.plusOne;

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
}
