class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int longest = 1;
        int inc = 1, dec = 1;
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[i - 1]) {
                dec++;
                inc = 1;
            } 
            else if (nums[i] > nums[i - 1]) {
                inc++;
                dec = 1;
            } 
            else {
                inc = 1;
                dec = 1;
            }
            longest = Math.max(longest, Math.max(inc, dec));
        }
        return longest;
    }
}