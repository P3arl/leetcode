class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        digits[n-1] = digits[n-1] + 1;
        int i = n-1;
        while(i > 0 && digits[i] == 10) {
            digits[i] = 0;
            digits[i-1] = digits[i-1]+1;
            i--;
        }
        if(i == 0 && digits[i] == 10) {
            int[] res = Arrays.copyOf(digits, digits.length+1);
            res[0] = 1;
            res[1] = 0;
            return res;
            
        }
        return digits;
    }
}
