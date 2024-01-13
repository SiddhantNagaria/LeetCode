class Solution {
    public int trailingZeroes(int n) {
       int fives=0;
        for(int i=5;i<=n;i+=5)
        {
            int x=i;
            while(x>0 && x%5==0)
            {
                ++fives;
                x/=5;
            }
        }
        return fives;
    }
}
