class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int n1 = name.length();
        int n2 = typed.length();
        int idx1 = 0, idx2 = 0;
        while (idx1 < n1 && idx2 < n2) {
            if (name.charAt(idx1) == typed.charAt(idx2)) {
                idx1++;
                idx2++;
                continue;
            }
            if (idx1 > 0 && name.charAt(idx1 - 1) == typed.charAt(idx2)) {
                idx2++;
            } else {
                return false;
            }
        }
        if (idx1 < n1)
            return false;
        while (idx2 < n2) {
            if (name.charAt(n1 - 1) != typed.charAt(idx2)) {
                return false;
            }
            idx2++;
        }
        return true;
    }
}