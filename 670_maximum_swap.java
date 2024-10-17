class Solution {
    public int maximumSwap(int num) {
    int maxIndex = -1, swap1 =-1, swap2=-1 ;
    char nums[] = Integer.toString(num).toCharArray();
    int n = nums.length;

    for(int i=n-1; i>=0; i--)
    {
      if(maxIndex==-1 || nums[i]>nums[maxIndex])
      {
        maxIndex = i; 
      } 
      else if(nums[i]<nums[maxIndex])
      {
        swap1 = i;
        swap2 = maxIndex;
      }  
    }

    if(swap1!=-1 && swap2!=-1)
    {
       char temp = nums[swap1];
       nums[swap1] = nums[swap2];
       nums[swap2] = temp;
    }
      return Integer.parseInt(new String(nums)) ;
    }
}


////////////////


class Solution {
    public int maximumSwap(int num) {
        char[] digits = Integer.toString(num).toCharArray();
        
        int[] buckets = new int[10];
        for (int i = 0; i < digits.length; i++) {
            buckets[digits[i] - '0'] = i;
        }
        
        for (int i = 0; i < digits.length; i++) {
            for (int k = 9; k > digits[i] - '0'; k--) {
                if (buckets[k] > i) {
                    char tmp = digits[i];
                    digits[i] = digits[buckets[k]];
                    digits[buckets[k]] = tmp;
                    return Integer.valueOf(new String(digits));
                }
            }
        }
        return num;
    }
}