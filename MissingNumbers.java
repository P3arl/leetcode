// Probelem link -> https://algomaster.io/practice/dsa/missing-ranges

//Complexity Analysis

//Time Complexity: O(n). We iterate through the array once, checking each consecutive pair. Each gap check is O(1), so the total is O(n).
// Space Complexity: O(1). Ignoring the output list, we only use a few variables.

class Solution {
    public List<List<Integer>> findMissingRanges(int[] nums, int lower, int upper) {

        List<List<Integer>> result = new ArrayList<>();
        if(nums.length == 0) {
            result.add(Arrays.asList(lower, upper));
            return result;
        }
        int n = nums.length;

        int i=1;

        if(nums[0] > lower) {
            result.add(Arrays.asList(lower,nums[0]-1));
        }

        while(i < n) {
            if(nums[i] - nums[i-1] >1) {
                result.add(Arrays.asList(nums[i-1]+1, nums[i]-1));
                i++;
            } else {
                i++;
            }
        }
        if(nums[n-1] < upper) {
            result.add(Arrays.asList(nums[n-1]+1, upper));
        }
        return result;
    }
}
