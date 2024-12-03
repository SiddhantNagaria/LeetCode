class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int prev = 0;
        for (int i : spaces) {
            sb.append(s.substring(prev, i)).append(" ");
            prev = i;
        }
        sb.append(s.substring(prev));
        return sb.toString();
    }
}