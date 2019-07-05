// This solution is efficient and fast then previous solution i.e. 238.ProductofArrayExceptSelf.java
// It runs in O(n) time.
class Solution {
    public int[] productExceptSelf(int[] a) {
        int n = a.length;
        if(n == 0) {
            return a;
        }
        int res[] = new int[n];
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = 1;
        for(int i=1;i<n;i++) {
            left[i] = a[i-1]*left[i-1];
        }
        right[n-1] = 1;
        for(int i=n-2;i>=0;i--) {
            right[i] = right[i+1]*a[i+1]; 
        }
        for(int i=0;i<n;i++) {
            res[i] = left[i]*right[i];
        }
        return res;
    }
}
