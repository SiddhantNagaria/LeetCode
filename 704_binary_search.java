class Solution {
    public int search(int[] nums, int target) {
        int index=-1;
        int begin=0, end=nums.length-1, middle=(end+begin)/2;
        while(begin<=end){
            if (nums[middle]==target) return middle;
            if (nums[middle]>target){
                end=middle-1; middle=(end+begin)/2;
            }
            if (nums[middle]<target){
                begin=middle+1; middle=(end+begin)/2;
            }
        }
        return index;
    }
}

//

class Solution {
    public int search(int[] nums, int target) {
        int index=-1;
        int start=0, end=nums.length-1, middle=(end+start)/2;
        while(start<=end){
            if (nums[middle]==target) return middle;
            if (nums[middle]>target){
                end=middle-1; middle=(end+start)/2;
            }
            if (nums[middle]<target){
                start=middle+1; middle=(end+start)/2;
            }
        }
        return index;
    }
}