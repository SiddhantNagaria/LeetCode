class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        for(int i = nums.length-1; i>1; i--){
            if(nums[i] < nums[i-1]+nums[i-2]){
                return nums[i] + nums[i-1] + nums[i-2];
            }
        }
        return 0 ;
    }
}

//or

class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for(int i = nums.length-1; i>1; i--){
            int l3 = nums[i];
            int l2 = nums[i-1];
            int l1 = nums[i-2];
            if(l3<l1+l2){
                return l1 + l2 + l3;
            }
        }
        return 0;
    }
}