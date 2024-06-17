class Solution {
    public int singleNumber(int[] nums) {
       int val=0;
       for(int i =0; i<nums.length; i++){
        val^=nums[i];
       } 
       return val;
    }
}