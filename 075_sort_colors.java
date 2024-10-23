class Solution {
    public void sortColors(int[] nums) {
        int start = 0;
        int mid = 0;
        int end = nums.length - 1;
        while (mid <= end) {
            switch (nums[mid]) {
                case 0:
                    // Swap with start index
                    swap(nums, start, mid);
                    mid++;
                    start++;
                    break;
                case 1:
                    mid++;
                    break;

                case 2:
                    // Swap with end index
                    swap(nums, mid, end);
                    end--;
                    break;
            }
        }
    }
    private void swap(int[] arr, int pos1, int pos2) {
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }
}


//////////////////////////////////////////////////////////////////////////////

public class Solution {
    public void sortColors(int[] nums) {
       for(int i = 0; i<nums.length;i++){
        for(int j= i+1;j<nums.length;j++){
            if(nums[i]>=nums[j]){
                int temp = nums[i];
                nums[i]=nums[j];
                nums[j] = temp;
            }
        }
       }
    }
}

