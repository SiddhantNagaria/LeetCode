class Solution {
    public int largestCombination(int[] candidates) {
      int maxFreq = 0;  
      for(int i=0; i<24; i++)
      {
        int freq = 0;
        for(int x : candidates)
        {
           if((x&(1<<i))!=0)
           freq++;  
        }
        maxFreq = Math.max(maxFreq, freq);
      }
       return maxFreq;

    }
}