class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        List<Integer> arr = new ArrayList<>();
        
        for(int i = 0; i<n; i++){
            int sum = 0;
            for(int j = i; j<n; j++){
                sum+=nums[j];
                arr.add(sum);
            }
        }
        Collections.sort(arr);
        int result=0;
        int mod=1000000007;
        for(int i=left-1;i<right;i++){
            result=(result+arr.get(i))%mod;
        }
        return result;
    }
}