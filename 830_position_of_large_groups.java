class Solution {
    public List<List<Integer>> largeGroupPositions(final String s) {
        List<List<Integer>> result = new ArrayList<>();
        int start = 0;
        char prev = s.charAt(0);

        for(int i = 0; i < s.length(); i++) {
            if(prev != s.charAt(i)) {
                if(i - start > 2)
                    result.add(Arrays.asList(start, i - 1));

                start = i;
                prev = s.charAt(i);
            }
        }

        if(s.length() - start > 2)
            result.add(Arrays.asList(start, s.length() - 1));

        return result;
    }
}

///////////


class Solution {
    public List<List<Integer>> largeGroupPositions(final String s) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0, j = 0; i < s.length(); i = j) {
            while(j<s.length() && s.charAt(i)==s.charAt(j)){
                j++;
            }
            if(j-i>=3){
                result.add(Arrays.asList(i,j-1));
            }
        }
        return result;
    }
}