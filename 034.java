class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] arr=new int[2];
        int n=nums.length;
        if(n==0){
            return new int [] {-1,-1};
        }
        int index=0;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                arr[0]=i;
                break;
            }
            else{
                arr[0]=-1;
            }
        }
        for(int i=n-1;i>=0;i--){
            if(nums[i]==target){
                arr[1]=i;
                break;
            }
            else{
                arr[1]=-1;
            }
        }
        return arr;
    }
}