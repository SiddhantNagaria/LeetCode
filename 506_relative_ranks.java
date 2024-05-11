import java.util.*;

class Solution {
    public String[] findRelativeRanks(int[] nums) {
        // Create a TreeMap to store the score and its index
        TreeMap<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());
        
        // Populate the TreeMap with scores and their indices
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        
        // Initialize result array with length equal to nums array
        String[] result = new String[nums.length];
        
        // Counter for assigning ranks
        int count = 1;
        
        // Iterate through the TreeMap
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int index = entry.getValue();
            // Assign ranks based on the count
            if (count == 1)
                result[index] = "Gold Medal";
            else if (count == 2)
                result[index] = "Silver Medal";
            else if (count == 3)
                result[index] = "Bronze Medal";
            else
                result[index] = String.valueOf(count);
            count++;
        }
        
        return result;
    }
}
