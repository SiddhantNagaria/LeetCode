//3ms
class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length;
        int[] count = new int[n + 1];
        count[0] = 1;
        int result = 0, oddCount = 0;
        for (int num : nums) {
            oddCount += num & 1;
            if (oddCount - k >= 0) {
                result += count[oddCount - k];
            }
            count[oddCount]++;
        }
        return result;
    }
}

//or
//42ms
class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int res = 0;
        int curr = 0;
        Map<Integer, Integer> map = new HashMap();
        map.put(0,1);
        for(int i : nums){
            curr += i%2; //even par 0 add karega aur odd pe 1 add karega
            res += map.getOrDefault(curr -k,0);
            map.put(curr, map.getOrDefault(curr,0)+1);
        }
        return res;
    }
}