import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String , List<String>> grp = new HashMap<>();
        for(String str : strs){
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String sortedStr = String.valueOf(charArr);
           if(!grp.containsKey(sortedStr)){
            grp.put(sortedStr, new ArrayList<>());
           } 
           grp.get(sortedStr).add(str);
        }
        return new ArrayList<>(grp.values());
    }
}