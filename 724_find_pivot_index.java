class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        int leftTotal = 0;
        for (int i = 0; i < nums.length; i++) {
            int rightTotal = total - leftTotal - nums[i];
            if (rightTotal == leftTotal) {
                return i;
            }
            leftTotal += nums[i];
        }
        return -1;        
    }
}

//or

class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        int left = 0;
        int right = sum;
        for (int i = 0; i < nums.length; i++) {
            right -= nums[i];
            if (right == left) {
                return i;
            }
            left += nums[i];
        }
        return -1;
    }
}