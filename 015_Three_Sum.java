import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0;i<nums.length;i++){
           if(i>0 && nums[i]==nums[i-1]) continue;
           int target = -nums[i];
           int lo = i+1, hi = nums.length-1;
           while(lo<hi){
            if(nums[lo]+nums[hi]==target){
                res.add(Arrays.asList(nums[lo],nums[hi],nums[i]));
                while(lo<hi && nums[lo]==nums[lo+1]) lo++;
                while(lo<hi && nums[hi]==nums[hi-1]) hi--;
                lo++;
                hi--;
            }
            else if(nums[lo] + nums[hi]<target) lo++;
            else hi--;
           }
        }
        return res;
    }
}