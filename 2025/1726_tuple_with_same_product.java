
import java.util.HashMap;

class Solution {

    public int tupleSameProduct(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int product = nums[i] * nums[j];
                hm.put(product, hm.getOrDefault(product, 0) + 1);
            }
        }
        int count = 0;
        for (int freq : hm.values()) {
            count += 8 * nC2(freq);
        }

        return count;
    }

    private int nC2(int n) {
        return (n * (n - 1)) / 2;
    }
}
