class Solution {
    public int prefixCount(String[] words, String pref) {
        int c = 0;
        int n = pref.length();
        for (String w : words) {
            if (w.length() >= n && w.startsWith(pref)) {
                c++;
            }
        }
        return c;
    }
}

class Solution {
    public int prefixCount(String[] words, String pref) {
        int prefLen = pref.length();
        int count = 0;
        for(int i = 0; i<words.length; i++){
            if(words[i].length() >= prefLen){
                String check = words[i].substring(0, prefLen);
                if(pref.equals(check)){
                    count++;
                }
            }
        }
        return count;
    }
}