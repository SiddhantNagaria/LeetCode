
import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> index = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer j = index.put(nums[i], i); // put() returns previous value associated with the given key or null if key didn't exist
            if (j != null && (i - j) <= k) {
                return true;
            }
        }
        return false;
    }
}