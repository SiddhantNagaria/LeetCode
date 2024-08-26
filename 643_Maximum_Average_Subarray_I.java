//6ms
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max = Integer.MIN_VALUE;
        double sum = 0;
        int start = 0;
        for (int end = 0; end < nums.length; end++) {
            sum = sum + nums[end];
            if (end - start + 1 == k) {
                max = Math.max(max, sum / k);
                sum = sum - nums[start];
                start++;
            }
        }
        return max;
    }
}

//or 

//3ms

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int i = 0; i<k;i++){
            sum+=nums[i];
        }
        int maxSum = sum;
        int startIndex = 0;
        int endIndex = k;

        while(endIndex < nums.length){
            sum -= nums[startIndex];
            startIndex++;

            sum += nums[endIndex];
            endIndex++;

            maxSum = Math.max(maxSum, sum);
        }
        return (double) maxSum/k;
    }
}