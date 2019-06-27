/**
Implement strStr().

Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

This solution is brute-force O(n*m) time complexity.
*/
class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        if(m == 0) {
            return 0;
        }
        int found = -1;
        for(int i=0;i<=n-m;i++) {
            
            int j;
            for(j=0;j<m;j++) {
                if(haystack.charAt(i+j) != needle.charAt(j)) {
                    break;
                } else if(j == m-1) {
                    return i;
                }
            }
        }
        return found;
    }
}
