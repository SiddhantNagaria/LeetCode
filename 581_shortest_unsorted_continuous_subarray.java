class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            // Decreasing Value
            if (nums[i] < nums[i - 1]) {
                min = Math.min(min, nums[i]);
            }
        }
        for (int i = n - 2; i >= 0; i--) {
            // Increasing value
            if (nums[i] > nums[i + 1]) {
                max = Math.max(max, nums[i]);
            }
        }
        if (min == Integer.MAX_VALUE && max == Integer.MIN_VALUE)
            return 0;
        int start = 0, end = n - 1;
        for (start=0; start < n; start++) {
            if (nums[start] > min)
                break;
        }

        for (; end >= 0; end--) {
            if (nums[end] < max)
                break;
        }

        return end - start + 1;
    }
}

//or

class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] arr= new int[nums.length];
        System.arraycopy(nums,0,arr,0,nums.length);
        Arrays.sort(arr);
        int start = 0, end = nums.length-1;
        for(;start < nums.length; start++) {
            if(nums[start] != arr[start]) break;
        }
        if(start >= nums.length-1) return 0;
        for(; end>=0; end--){
            if(nums[end] != arr[end]) break;
        }
        
        return end-start+1;
    }
}


//////////////

class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int end = -1;
        int max = nums[0];
        for(int i =1; i<nums.length;i++){
            if(max>nums[i]){
                end = i;
            }else{
                max = nums[i];
            }
        }
        int start = 0;
        int min=nums[nums.length-1];
        for(int i = nums.length-2;i>=0;i--){
            if(nums[i]>min){
                start=i;
            }else{
                min = nums[i];
            }
        }
        return end - start + 1;
    }
}