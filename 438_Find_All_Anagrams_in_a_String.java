public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length())
            return result;

        int[] pCount = new int[26];
        int[] sCount = new int[26];

        // Fill pCount with frequency of each character in p
        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }

        int left = 0, right = 0;
        while (right < s.length()) {
            // Add the current character to the sCount array
            sCount[s.charAt(right) - 'a']++;

            // Check if the window size exceeds the size of p
            if (right - left + 1 > p.length()) {
                // Remove the character at the left of the window
                sCount[s.charAt(left) - 'a']--;
                left++;
            }

            // If the window size matches p.length and the counts are the same
            if (right - left + 1 == p.length()) {
                if (Arrays.equals(sCount, pCount)) {
                    result.add(left);
                }
            }

            right++;
        }

        return result;
    }
}
