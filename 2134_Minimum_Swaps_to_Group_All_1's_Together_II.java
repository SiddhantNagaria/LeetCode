class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        // int [] temp=new int [2*n];
        // int count = 0;
        int ones = 0;
        for(int i = 0;i<n;i++){
            if(nums[i]==1){
                ones++;
            }
        }
        int i=0;
        int j=0;
        int CurrONes=0;
        int maxOnes=0;
        while(j<2*n){
            if(nums[j%n]==1){
                CurrONes++;
            }
            if(j-i+1>ones){
                CurrONes-=nums[i%n];
                i++;
            }
             maxOnes=Math.max(maxOnes,CurrONes);
            j++;
        }
        return ones-maxOnes;
    }
}