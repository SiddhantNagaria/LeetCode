
class Solution {

    public int maxAscendingSum(int[] nums) {
        int curr = nums[0], max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            curr = nums[i] > nums[i - 1] ? curr + nums[i] : nums[i];
            max = Math.max(curr, max);
        }
        return max;
    }
}
