
import java.util.*;

class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2))
            return true;

        int m = s1.length();
        int n = s2.length();

        int mismatches = 0;
        List<Character> mismatch = new ArrayList<>();
        int pos = 0;
        while (pos < m) {
            if (s1.charAt(pos) != s2.charAt(pos)) {
                mismatch.add(s1.charAt(pos));
                mismatch.add(s2.charAt(pos));
                mismatches++;
            }
            pos++;
        }
        if (mismatch.size() == 4) {
            return (mismatch.get(0) == mismatch.get(3) && mismatch.get(1) == mismatch.get(2));
        }
        return false;
    }
}