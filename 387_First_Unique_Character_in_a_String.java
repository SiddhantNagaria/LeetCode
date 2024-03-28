import java.util.HashMap;
import java.util.Map;

class Solution {
    public int firstUniqChar(String s) {
       Map<Character,Integer>chMap = new HashMap<>();
       char[]chars = s.toCharArray();
       for(char ch:chars){
        chMap.put(ch,chMap.getOrDefault(ch,0)+1);
       } 
       for(int i =0;i<chars.length;i++){
        char ch= chars[i];
        if(chMap.get(ch)==1){
            return i;
        }
       }
       return -1;
    }
}