class Solution {
    public List<Integer> partitionLabels(String s) {
        Map<Character, Integer> lastIdx = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            lastIdx.put(s.charAt(i), i);
        }
        List<Integer> res = new ArrayList<>();
        int curLast = 0, accu = 0;
        for (int i = 0; i < s.length(); i++) {
            curLast = Math.max(curLast, lastIdx.get(s.charAt(i)));
            if (i == curLast) {
                res.add(i + 1 - accu);
                accu = i + 1;
            }
        }
        return res;
    }
}