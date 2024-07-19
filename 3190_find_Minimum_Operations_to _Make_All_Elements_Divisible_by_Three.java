//4ms
class Solution {
    public int minimumOperations(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] % 3) != 0) {
                if ((nums[i] + 1) % 3 == 0) {
                    counter += 1;
                } 
                else if ((nums[i] - 1) % 3 == 0) {
                    counter += 1;
                }
            }
        }
        return counter;
    }
}

//or

//0 ms
class Solution {
    public int minimumOperations(int[] nums) {
        int counter = 0;
        for(int i =0; i<nums.length;i++){
            int a = nums[i]%3;
            if(a==0)continue;
            counter++;
        }
        return counter;
    }
}