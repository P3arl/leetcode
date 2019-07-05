/*
Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the product of 
all the elements of nums except nums[i].
*/
// This is brute force solution of above mentioned problem. Time complexity: O(n^2)
class Solution {
    public int[] productExceptSelf(int[] a) {
        int res[] = new int[a.length];
        for(int i = 0;i<res.length;i++) {
            res[i] = 1;
        }
        int c = 1;
        for(int i = 0;i<a.length;i++) {
            for(int j = 0;j< a.length;j++) {
                if(i != j) {
                    res[i] = res[i]*a[j];
                }
            }
        }
        return res;
        
    }
}
