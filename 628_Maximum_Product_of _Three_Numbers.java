class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int n1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        int n2 = nums[0] * nums[1] * nums[n - 1];
        if (n1 > n2)
            return n1;
        return n2;
    }
}