class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0, end = nums.length-1, middle = (end + start) / 2;
        while (start <= end) {
            if (nums[middle] == target) {
                return middle;
            }
            if(nums[middle]>target){
                end = middle -1;
                middle = (end+start)/2;
            }
            if(nums[middle]<target){
                start = middle + 1;
                middle = (start+end)/2;
            }
        }
        return start;
    }
}