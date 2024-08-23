class Solution {
    public int arrayNesting(int[] nums) {
        int maxLength = 0;
        for (int i = 0; i < nums.length; i++) {
            int length = 0;
            int current = i;
            while (nums[current] != -1) {
                int next = nums[current];
                nums[current] = -1; // Marking as visited
                length++;
                current = next;
            }
            maxLength = Math.max(maxLength, length);
        }
        return maxLength;
    }

}
